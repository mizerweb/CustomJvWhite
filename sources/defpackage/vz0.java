package defpackage;

import android.text.style.StyleSpan;

/* JADX INFO: loaded from: classes.dex */
public final class vz0 extends StyleSpan implements gn9 {
    public final int a;

    public vz0() {
        super(1);
        this.a = 2;
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new vz0();
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.a;
    }
}
