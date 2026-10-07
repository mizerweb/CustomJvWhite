package defpackage;

import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class d1b extends TypefaceSpan implements gn9 {
    public final int a;

    public d1b() {
        super("monospace");
        this.a = 5;
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new d1b();
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.a;
    }
}
