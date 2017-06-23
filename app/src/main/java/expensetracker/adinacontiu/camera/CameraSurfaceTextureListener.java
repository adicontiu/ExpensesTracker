package expensetracker.adinacontiu.camera;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/**
 * Created by adina.contiu on 23/06/17.
 */
public class CameraSurfaceTextureListener implements TextureView.SurfaceTextureListener {

    private MakePhotoActivity makePhotoActivity;

    public CameraSurfaceTextureListener(MakePhotoActivity makePhotoActivity) {
        this.makePhotoActivity = makePhotoActivity;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        //open your camera here
        this.makePhotoActivity.openCamera();
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        // Transform you image captured size according to the surface width and height
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }
}
