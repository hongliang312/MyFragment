package com.lightheart.sphr.myrecycle;

import android.view.View;

/**
 * Created by 知足 on 2018/5/2.
 */

public interface OnItemClickListener {
    /**
     * item点击回调
     *
     * @param view
     * @param position
     */
    void onItemClick(View view, int position);

    /**
     * 删除按钮回调
     *
     * @param position
     */
    void onDeleteClick(int position);
}
