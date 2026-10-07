package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tv5 implements ohf, uv5 {
    public final /* synthetic */ int a;
    public final ohf b;
    public final int c;

    public tv5(ohf ohfVar, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = ohfVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                c.o(nbh.t("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                this.b = ohfVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                c.o(nbh.t("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.uv5
    public final ohf a(int i) {
        int i2 = this.a;
        ohf ohfVar = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new tv5(this, i, 0) : new tv5(ohfVar, i4, 0);
            default:
                return i >= i3 ? b76.a : new i7h(ohfVar, i, i3);
        }
    }

    @Override // defpackage.uv5
    public final ohf b(int i) {
        int i2 = this.a;
        ohf ohfVar = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new tv5(this, i, 1) : new i7h(ohfVar, i3, i4);
            default:
                return i >= i3 ? this : new tv5(ohfVar, i, 1);
        }
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new sv5(this);
            default:
                return new sv5(this, (byte) 0);
        }
    }
}
