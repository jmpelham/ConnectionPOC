package com.morethanwinners.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class JsonService extends Service {
    public JsonService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
