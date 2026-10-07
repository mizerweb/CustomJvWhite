package defpackage;

import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class po2 extends v55 implements v7h {
    public v7h d;
    public long e;
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ po2(w7h w7hVar, int i) {
        this.f = i;
        this.g = w7hVar;
    }

    @Override // defpackage.v7h
    public final int e(long j) {
        v7h v7hVar = this.d;
        v7hVar.getClass();
        return v7hVar.e(j - this.e);
    }

    @Override // defpackage.v7h
    public final List h(long j) {
        v7h v7hVar = this.d;
        v7hVar.getClass();
        return v7hVar.h(j - this.e);
    }

    @Override // defpackage.v7h
    public final long m(int i) {
        v7h v7hVar = this.d;
        v7hVar.getClass();
        return v7hVar.m(i) + this.e;
    }

    @Override // defpackage.v7h
    public final int o() {
        v7h v7hVar = this.d;
        v7hVar.getClass();
        return v7hVar.o();
    }

    @Override // defpackage.v55
    public final void q() {
        this.a = 0;
        this.b = 0L;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.v55
    public final void r() {
        switch (this.f) {
            case 0:
                qo2 qo2Var = (qo2) ((ot4) this.g).b;
                q();
                qo2Var.b.add(this);
                return;
            case 1:
                mec mecVar = (mec) this.g;
                synchronized (mecVar.b) {
                    q();
                    v55[] v55VarArr = mecVar.f;
                    int i = mecVar.h;
                    mecVar.h = i + 1;
                    v55VarArr[i] = this;
                    if (!mecVar.c.isEmpty() && mecVar.h > 0) {
                        mecVar.b.notify();
                    }
                    break;
                }
                return;
            default:
                ((eh5) this.g).n(this);
                return;
        }
    }

    public final void s(long j, v7h v7hVar, long j2) {
        this.b = j;
        this.d = v7hVar;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            j = j2;
        }
        this.e = j;
    }

    public /* synthetic */ po2() {
        this.f = 0;
    }
}
