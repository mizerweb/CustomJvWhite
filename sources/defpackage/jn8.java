package defpackage;

import android.text.style.StyleSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class jn8 extends StyleSpan implements gn9 {
    public final int a;

    public jn8() {
        super(2);
        this.a = 3;
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new jn8();
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.a;
    }
}
