package com.example.weikunkun.welcome;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 建立没个欢迎页面的Fragment去加载自定义视频View的视图
 * author: kongwiki
 * date: on 18-12-28
 * email: kongwiki@163.com
 */

public class GuildFragment extends Fragment {

    private CustomVideoView customVideoView;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        customVideoView = new CustomVideoView(getContext());
        /**获取参数，根据不同的参数播放不同的视频**/
        int index = getArguments().getInt("index");
        Uri uri;
        if (index == 1) {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_9);
        } else if (index == 2) {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_10);
        } else {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_1);
        }
        /**播放视频**/
        customVideoView.playVideo(uri);
        return customVideoView;
    }

    /**
     * 记得在销毁的时候让播放的视频终止
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (customVideoView != null) {
            customVideoView.stopPlayback();
        }
    }


}
