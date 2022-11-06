package com.design.Proxy;

// Интерфейс удалённого сервиса.

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();
    Video getVideo(String id);
}
