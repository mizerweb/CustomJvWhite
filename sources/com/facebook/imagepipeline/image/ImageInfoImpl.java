package com.facebook.imagepipeline.image;

import defpackage.i1e;
import defpackage.l68;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ImageInfoImpl implements l68 {
    private final Map<String, Object> extras;
    private final int height;
    private final i1e qualityInfo;
    private final int sizeInBytes;
    private final int width;

    public ImageInfoImpl(int i, int i2, int i3, i1e i1eVar, Map<String, Object> map) {
        this.width = i;
        this.height = i2;
        this.sizeInBytes = i3;
        this.qualityInfo = i1eVar;
        this.extras = map;
    }

    @Override // defpackage.l68, com.facebook.fresco.middleware.HasExtraData
    public Map<String, Object> getExtras() {
        return this.extras;
    }

    @Override // defpackage.l68
    public int getHeight() {
        return this.height;
    }

    public i1e getQualityInfo() {
        return this.qualityInfo;
    }

    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    @Override // defpackage.l68
    public int getWidth() {
        return this.width;
    }
}
