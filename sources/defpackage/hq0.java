package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.ImageInfoImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class hq0 implements xt3 {
    public static final HashSet c = new HashSet(Arrays.asList(HasExtraData.KEY_ENCODED_SIZE, HasExtraData.KEY_ENCODED_WIDTH, HasExtraData.KEY_ENCODED_HEIGHT, HasExtraData.KEY_URI_SOURCE, HasExtraData.KEY_IMAGE_FORMAT, HasExtraData.KEY_BITMAP_CONFIG, HasExtraData.KEY_IS_ROUNDED, HasExtraData.KEY_NON_FATAL_DECODE_ERROR, HasExtraData.KEY_ORIGINAL_URL, HasExtraData.KEY_MODIFIED_URL, HasExtraData.KEY_COLOR_SPACE));
    public final HashMap a = new HashMap();
    public ImageInfoImpl b;

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.a.get(str);
        return obj2 == null ? obj : obj2;
    }

    @Override // defpackage.l68, com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.a;
    }

    @Override // defpackage.xt3
    public final l68 getImageInfo() {
        if (this.b == null) {
            this.b = new ImageInfoImpl(getWidth(), getHeight(), getSizeInBytes(), getQualityInfo(), this.a);
        }
        return this.b;
    }

    @Override // defpackage.xt3
    public i1e getQualityInfo() {
        return s98.d;
    }

    @Override // defpackage.xt3
    public boolean isStateful() {
        return false;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (c.contains(str)) {
            this.a.put(str, obj);
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        for (String str : c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.a.put(str, obj);
            }
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return getExtra(str, null);
    }
}
