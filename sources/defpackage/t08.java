package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t08 extends kjh {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ w08 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t08(String str, w08 w08Var, int i, int i2) {
        super(str, true);
        this.f = w08Var;
        this.g = i;
    }

    @Override // defpackage.kjh
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.k.getClass();
                try {
                    this.f.w.I(this.g, 9);
                    synchronized (this.f) {
                        this.f.y.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            case 1:
                this.f.k.getClass();
                try {
                    this.f.w.I(this.g, 9);
                    synchronized (this.f) {
                        this.f.y.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
            default:
                this.f.k.getClass();
                synchronized (this.f) {
                    this.f.y.remove(Integer.valueOf(this.g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t08(String str, w08 w08Var, int i, List list) {
        super(str, true);
        this.f = w08Var;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t08(String str, w08 w08Var, int i, List list, boolean z) {
        super(str, true);
        this.f = w08Var;
        this.g = i;
    }
}
