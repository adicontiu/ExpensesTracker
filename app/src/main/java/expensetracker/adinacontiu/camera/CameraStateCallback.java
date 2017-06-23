package expensetracker.adinacontiu.camera;

import android.hardware.camera2.CameraDevice;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by adina.contiu on 23/06/17.
 */
public class CameraStateCallback extends CameraDevice.StateCallback {
    private CameraDevice cameraDevice;
    private MakePhotoActivity makePhotoActivity;

    public CameraStateCallback(CameraDevice cameraDevice, MakePhotoActivity makePhotoActivity) {
        this.cameraDevice = cameraDevice;
        this.makePhotoActivity = makePhotoActivity;
    }

    @Override
    public void onOpened(CameraDevice camera) {
        //This is called when the camera is open
        Log.e(TAG, "onOpened");
        cameraDevice = camera;
        makePhotoActivity.createCameraPreview();
    }

    @Override
    public void onDisconnected(CameraDevice camera) {
        cameraDevice.close();
    }

    @Override
    public void onError(CameraDevice camera, int error) {
        cameraDevice.close();
        cameraDevice = null;
    }
}
