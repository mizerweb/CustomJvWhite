package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i7h implements ohf, uv5 {
    public final ohf a;
    public final int b;
    public final int c;

    public i7h(ohf ohfVar, int i, int i2) {
        this.a = ohfVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            c.o(zo5.h(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            c.o(zo5.h(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        c.o(qt4.l("endIndex should be not less than startIndex, but was ", i2, i, " < "));
        throw null;
    }

    @Override // defpackage.uv5
    public final ohf a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? b76.a : new i7h(this.a, i3 + i, i2);
    }

    @Override // defpackage.uv5
    public final ohf b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new i7h(this.a, i3, i + i3);
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new h7h(this);
    }
}
