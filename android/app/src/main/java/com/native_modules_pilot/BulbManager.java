package com.native_modules_pilot;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.common.MapBuilder;
import java.util.Map;


public class BulbManager extends SimpleViewManager<BulbView> {

    @Override
    public String getName() {
        return "Bulb";
    }

    @Override
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder()
                .put(
                        "statusChange",
                        MapBuilder.of(
                                "phasedRegistrationNames",
                                MapBuilder.of("bubbled", "onStatusChange")))
                .build();
    }

    @Override
    protected BulbView createViewInstance(ThemedReactContext reactContext) {

        return new BulbView(reactContext);

    }

    @ReactProp(name="isOn")
        public void setBulbStatus(BulbView bulbView, Boolean isOn) {
        bulbView.setIsOn(isOn);
    }
}