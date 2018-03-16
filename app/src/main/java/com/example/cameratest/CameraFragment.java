package com.example.cameratest;

import android.support.v4.app.Fragment;

/**
 * Created by 易辰 on 2018/3/15.
 */

public class CameraFragment extends Fragment {
//
//    private static final int REQUEST_IMAGE_CAPTURE = 12345;
//
//    @BindView(R.id.constraintLayout_camera_cameraContent)
//    ConstraintLayout constraintLayoutCameraCameraContent;
//    Unbinder unbinder;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_main_camera, container, false);
//        unbinder = ButterKnife.bind(this, view);
//
//        openCamera();
//
//        return view;
//    }
//
////    @Override
////    public void onActivityResult(int requestCode, int resultCode, Intent data) {
////        super.onActivityResult(requestCode, resultCode, data);
////        if (resultCode == Activity.RESULT_OK) {
////            if (requestCode == REQUEST_IMAGE_CAPTURE) {
////                // Do something with imagePath
////
////                Bitmap photo = (Bitmap) data.getExtras().get("data");
////                imageview.setImageBitmap(photo);
////                // CALL THIS METHOD TO GET THE URI FROM THE BITMAP
////                Uri selectedImage = getImageUri(getActivity(), photo);
////                String realPath=getRealPathFromURI(selectedImage);
////                selectedImage = Uri.parse(realPath);
////            }
////        }
////    }
//
//    private void openCamera(){
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        Fragment fragment = this;
////        fragment.startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
//        fragment.startActivity(intent);
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        unbinder.unbind();
//    }
}
