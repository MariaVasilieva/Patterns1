package org.example.observer;

public class MediaChannel {
    private String channelName;
    private SubsriberManager subsriberManager;
    public MediaChannel(String channelName, SubsriberManager subsriberManager) {
        this.channelName = channelName;
        this.subsriberManager = subsriberManager;
    }

    public void uploadVideo(String videoTitle) {
        subsriberManager.notifyObservers("video", channelName +" public video: "+videoTitle);
    }
    public void startStreaming(String streamTopic) {
        subsriberManager.notifyObservers("stream", channelName+" starting streaming:" + streamTopic);
    }
}
