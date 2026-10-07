package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq0 implements fb0 {
    public cb0 b;
    public cb0 c;
    public cb0 d;
    public cb0 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public aq0() {
        ByteBuffer byteBuffer = fb0.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        cb0 cb0Var = cb0.e;
        this.d = cb0Var;
        this.e = cb0Var;
        this.b = cb0Var;
        this.c = cb0Var;
    }

    public abstract cb0 a(cb0 cb0Var);

    public void b() {
    }

    @Override // defpackage.fb0
    public boolean c() {
        return this.h && this.g == fb0.a;
    }

    @Override // defpackage.fb0
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = fb0.a;
        return byteBuffer;
    }

    @Override // defpackage.fb0
    public final void e(db0 db0Var) {
        this.g = fb0.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // defpackage.fb0
    public final cb0 g(cb0 cb0Var) {
        this.d = cb0Var;
        this.e = a(cb0Var);
        return isActive() ? this.e : cb0.e;
    }

    @Override // defpackage.fb0
    public final void h() {
        this.h = true;
        j();
    }

    @Override // defpackage.fb0
    public boolean isActive() {
        return this.e != cb0.e;
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.fb0
    public final void reset() {
        ByteBuffer byteBuffer = fb0.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        cb0 cb0Var = cb0.e;
        this.d = cb0Var;
        this.e = cb0Var;
        this.b = cb0Var;
        this.c = cb0Var;
        k();
    }
}
