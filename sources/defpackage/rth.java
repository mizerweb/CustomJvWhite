package defpackage;

import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class rth extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public Object f;
    public int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ guh i;
    public final /* synthetic */ guh j;
    public final /* synthetic */ ByteBuffer k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rth(long j, guh guhVar, lq4 lq4Var, guh guhVar2, ByteBuffer byteBuffer, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = j;
        this.i = guhVar;
        this.j = guhVar2;
        this.k = byteBuffer;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new rth(this.h, this.i, lq4Var, this.j, this.k, 0);
            default:
                return new rth(this.h, this.i, lq4Var, this.j, this.k, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((rth) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objS;
        Object objS2;
        int i = this.e;
        guh guhVar = this.i;
        long j = this.h;
        ByteBuffer byteBuffer = this.k;
        guh guhVar2 = this.j;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    AsynchronousByteChannel asynchronousByteChannel = guhVar2.b;
                    this.f = null;
                    this.g = 1;
                    ek2 ek2Var = new ek2(1, p90.B(this));
                    ek2Var.u();
                    asynchronousByteChannel.read(byteBuffer, new WeakReference(ek2Var), z10.b);
                    objS = ek2Var.s();
                    if (objS == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = this.f;
                        ch3.d0(obj);
                        return obj2;
                    }
                    ch3.d0(obj);
                    objS = obj;
                }
                long jNanoTime = System.nanoTime() - j;
                if (jNanoTime >= 60000000000L) {
                    String strS = nbh.s(jNanoTime, "channel.read seems to hang, but TimeoutCancellationException was not thrown, hang duration=", " ns");
                    gm0.V(guhVar.c, strS, new oth(strS));
                    n83 n83Var = new n83(2, null, 5);
                    this.f = objS;
                    this.g = 2;
                    if (lvb.J0(-1L, n83Var, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return objS;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    AsynchronousByteChannel asynchronousByteChannel2 = guhVar2.b;
                    this.f = null;
                    this.g = 1;
                    ek2 ek2Var2 = new ek2(1, p90.B(this));
                    ek2Var2.u();
                    asynchronousByteChannel2.write(byteBuffer, new WeakReference(ek2Var2), z10.b);
                    objS2 = ek2Var2.s();
                    if (objS2 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = this.f;
                        ch3.d0(obj);
                        return obj3;
                    }
                    ch3.d0(obj);
                    objS2 = obj;
                }
                long jNanoTime2 = System.nanoTime() - j;
                if (jNanoTime2 >= 60000000000L) {
                    String strS2 = nbh.s(jNanoTime2, "channel.write seems to hang, but TimeoutCancellationException was not thrown, hang duration=", " ns");
                    gm0.V(guhVar.c, strS2, new oth(strS2));
                    n83 n83Var2 = new n83(2, null, 6);
                    this.f = objS2;
                    this.g = 2;
                    if (lvb.J0(-1L, n83Var2, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return objS2;
        }
    }
}
