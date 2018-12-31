package com.example.weikunkun.welcome;


import android.net.Uri;
import android.util.Log;


/**
 * author: kongwiki
 * date: on 18-12-30
 * email: kongwiki@163.com
 */
public class Guild2Fragment extends LazyLoadFragment {
    private CustomVideoView customVideoView;
    private int index;

    @Override
    protected int setContentView() {
        return R.layout.fm_guild;
    }

    @Override
    protected void lazyLoad() {

        customVideoView = findViewById(R.id.cv);
        /**获取参数，根据不同的参数播放不同的视频**/
        index = getArguments().getInt("index");
        Log.d("Guild2Fragment","开始播放视频="+index);
        Uri uri;
        if (index == 1) {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_9);
        } else if (index == 2) {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_10);

        }
        else {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_1);
        }
        /**播放视频**/
        customVideoView.playVideo(uri);
    }

    @Override
    protected void stopLoad() {
        super.stopLoad();
        if (customVideoView != null) {
            customVideoView.stopPlayback();
        }
    }
}
