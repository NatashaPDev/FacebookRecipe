package com.natashapetrenko.facebookrecipes.libs.base;

import android.widget.ImageView;

/**
 * Created by petrenkonv on 26.10.2017.
 */

public interface ImageLoader {
    void load(ImageView imageView, String URL);
    void setOnFinishedImageLoadingListener(Object listener);
}
