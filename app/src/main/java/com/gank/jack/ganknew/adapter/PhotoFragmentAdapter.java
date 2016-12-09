package com.gank.jack.ganknew.adapter;

import com.gank.jack.ganknew.view.fragment.PhotoFragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;
import com.gank.jack.ganknew.bean.Gank;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import java.util.List;

/**
 * @author 谢汉杰
 */

public class PhotoFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Gank> listGank=null;

    public PhotoFragmentAdapter(FragmentManager fm,List<Gank> listGank) {
        super(fm);
        this.listGank=listGank;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle=new Bundle();
        bundle.putString("url",listGank.get(position).url);
        PhotoFragment photoFragment=new PhotoFragment();
        photoFragment.setArguments(bundle);
        return photoFragment;
    }

    @Override
    public int getCount() {
        return listGank.size();
    }

}