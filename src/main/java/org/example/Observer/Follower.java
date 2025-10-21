package org.example.Observer;

public class Follower implements Subscriber{
    private String followerName;
    private boolean interestedInVideo;
    private boolean interestedInStream;
    public Follower(String followerName, boolean interestedInVideo, boolean interestedInStream) {
        this.followerName = followerName;
        this.interestedInVideo = interestedInVideo;
        this.interestedInStream = interestedInStream;
    }

    public void setInterestedInVideo(boolean interestedInVideo) {
        this.interestedInVideo = interestedInVideo;
    }

    public void setInterestedInStream(boolean interestedInStream) {
        this.interestedInStream = interestedInStream;
    }

    @Override
    public void update(String eventType, String message) {
        if((eventType.equals("video") && interestedInVideo) || (eventType.equals("stream") && interestedInStream)) {
            System.out.println(followerName + ": " + message);
        }
    }

    @Override
    public String toString() {
        return "Follower{" +
                "followerName='" + followerName + '\'' +
                '}';
    }
}
