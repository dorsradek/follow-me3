package pl.rdors.follow_me3;

import android.content.Intent;
import android.location.Location;

/**
 * Created by rdors on 2016-11-02.
 */

public class IntentServiceTool {

    private AddressResultReceiver addressResultReceiver;
    private TestActivity activity;

    public IntentServiceTool(AddressResultReceiver addressResultReceiver, TestActivity activity) {
        this.addressResultReceiver = addressResultReceiver;
        this.activity = activity;
    }

    public void startIntentService(Location mLocation) {
        Intent intent = new Intent(activity, FetchAddressIntentService.class);
        intent.putExtra(AppUtils.LocationConstants.RECEIVER, addressResultReceiver);
        intent.putExtra(AppUtils.LocationConstants.LOCATION_DATA_EXTRA, mLocation);
        activity.startService(intent);
    }
}
