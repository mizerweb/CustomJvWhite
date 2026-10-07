package defpackage;

import android.util.FloatProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class dk extends FloatProperty {
    public float a;

    public dk(String str, float f) {
        super(str);
        this.a = f;
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f) {
        this.a = f;
    }
}
