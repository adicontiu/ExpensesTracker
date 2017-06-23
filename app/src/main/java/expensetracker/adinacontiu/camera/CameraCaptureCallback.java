package expensetracker.adinacontiu.camera;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.widget.Toast;

import java.io.File;

/**
 * Created by adina.contiu on 23/06/17.
 */
public class CameraCaptureCallback extends CaptureCallback {
    private MakePhotoActivity makePhotoActivity;
    private File file;


    public CameraCaptureCallback(MakePhotoActivity makePhotoActivity, File file) {
        this.makePhotoActivity = makePhotoActivity;
        this.file = file;

    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        super.onCaptureCompleted(session, request, result);
        Toast.makeText(makePhotoActivity, "Saved:" + file, Toast.LENGTH_SHORT).show();
        makePhotoActivity.createCameraPreview();
    }
}
