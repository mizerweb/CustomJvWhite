package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p3k implements bwe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bwe
    public final void a(f25 f25Var, byte[] bArr, int i) {
        bak bakVar;
        switch (this.a) {
            case 0:
                ((Handler) ((z18) this.b).e).post(new c86(this, f25Var, bArr, i, 5));
                break;
            case 1:
                ljf ljfVar = (ljf) this.b;
                vn7 vn7Var = (vn7) ljfVar.d;
                vn7Var.getClass();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.get();
                byteBufferWrap.get();
                byteBufferWrap.getShort();
                int i2 = byteBufferWrap.getInt() & 268435455;
                byteBufferWrap.getInt();
                byteBufferWrap.getInt();
                String string = StandardCharsets.UTF_8.decode(byteBufferWrap.slice()).toString();
                string.getClass();
                vn7Var.z(i2);
                ux uxVar = new ux(vn7Var.z(i2), string);
                Iterator it = ((CopyOnWriteArrayList) ljfVar.e).iterator();
                while (it.hasNext()) {
                    ((r81) it.next()).a.Q0.o.onAsrDataPackage(uxVar);
                }
                break;
            case 2:
                ((rve) this.b).f.post(new c86(this, f25Var, bArr, i, 6));
                break;
            default:
                d5f d5fVar = (d5f) this.b;
                if (!d5fVar.g) {
                    dik dikVar = new dik(bArr);
                    yt1 yt1VarZ = d5fVar.c.z(dikVar.d);
                    if (yt1VarZ != null) {
                        bak bakVar2 = null;
                        if (!d5fVar.g) {
                            if (d5fVar.a.get(yt1VarZ) != null) {
                                bakVar2 = (bak) d5fVar.a.get(yt1VarZ);
                            } else {
                                if (d5fVar.i == null ? true : d5fVar.i.contains(yt1VarZ)) {
                                    d5fVar.a.put(yt1VarZ, new bak(d5fVar.b, d5fVar.j, new c5f(d5fVar, 0, yt1VarZ)));
                                    bakVar2 = (bak) d5fVar.a.get(yt1VarZ);
                                }
                            }
                        }
                        if (bakVar2 != null) {
                            bakVar2.e.post(new v1k(bakVar2, 3, dikVar));
                        }
                        if ((dikVar.a & 8) != 0 && (bakVar = (bak) d5fVar.a.get(yt1VarZ)) != null) {
                            bakVar.a();
                            d5fVar.a.remove(yt1VarZ);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
