package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes3.dex */
public final class rak {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = -1;
    public final int f = 5120;
    public volatile boolean g;

    public static tak b(tak takVar, long j, long j2) {
        int i = (int) (j2 - j);
        if (i == takVar.e()) {
            return takVar;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(takVar.b(), (int) (j - takVar.d()), bArr, 0, i);
        return new qak(j, takVar.g(), bArr);
    }

    public static tak d(tak takVar, tak takVar2) {
        if (takVar.d() <= takVar2.d() && takVar.f() >= takVar2.f()) {
            return takVar;
        }
        if (takVar2.d() <= takVar.d() && takVar2.f() >= takVar.f()) {
            return takVar2;
        }
        int iF = (int) (takVar.f() - takVar2.d());
        byte[] bArr = new byte[(takVar2.e() + takVar.e()) - iF];
        System.arraycopy(takVar.b(), 0, bArr, 0, takVar.e());
        System.arraycopy(takVar2.b(), iF, bArr, takVar.e(), takVar2.e() - iF);
        return new qak(takVar.d(), takVar.g() || takVar2.g(), bArr);
    }

    public final int a(ByteBuffer byteBuffer) {
        if (this.e >= 0 && this.d == this.e) {
            return -1;
        }
        tak takVar = (tak) this.b.peek();
        int i = 0;
        while (takVar != null && byteBuffer.hasRemaining()) {
            int iMin = (int) Long.min(byteBuffer.remaining(), takVar.f() - this.d);
            byteBuffer.put(takVar.b(), (int) (this.d - takVar.d()), iMin);
            this.d += (long) iMin;
            i += iMin;
            if (this.d == takVar.f()) {
                this.b.remove();
                takVar = (tak) this.b.peek();
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    public final boolean c(tak takVar) throws Exception {
        tak takVarB;
        try {
            if (takVar.e() > 0) {
                tak takVar2 = (tak) this.a.lower(takVar);
                if (takVar2 == null) {
                    takVarB = takVar;
                } else {
                    if (!(takVar2.f() > takVar.d())) {
                        takVarB = takVar;
                    } else if (Long.max(takVar2.f(), takVar.f()) - Long.min(takVar2.d(), takVar.d()) <= this.f) {
                        takVarB = d(takVar2, takVar);
                        this.a.remove(takVar2);
                        takVar2.e();
                    } else {
                        takVarB = b(takVar, takVar2.f(), takVar.f());
                        if (this.a.lower(takVarB) != takVar2) {
                            tak takVar3 = (tak) this.a.lower(takVarB);
                            takVarB = d(takVar3, takVarB);
                            this.a.remove(takVar3);
                            takVar3.e();
                        }
                    }
                }
                tak takVar4 = (tak) this.a.higher(takVarB);
                while (takVar4 != null) {
                    if (!(takVarB.f() > takVar4.d())) {
                        break;
                    }
                    if (Long.max(takVarB.f(), takVar4.f()) - Long.min(takVarB.d(), takVar4.d()) <= this.f) {
                        takVarB = d(takVarB, takVar4);
                        this.a.remove(takVar4);
                        takVar4.e();
                    } else {
                        takVarB = b(takVarB, takVarB.d(), takVar4.d());
                    }
                    takVar4 = (tak) this.a.higher(takVarB);
                }
                if (this.a.add(takVarB)) {
                    takVarB.e();
                }
            }
            if (takVar.g()) {
                this.e = takVar.f();
            }
            long j = this.c;
            while (!this.a.isEmpty() && ((tak) this.a.first()).d() <= this.c) {
                tak takVarB2 = (tak) this.a.pollFirst();
                if (takVarB2.f() > this.c) {
                    if (takVarB2.d() < this.c) {
                        takVarB2 = b(takVarB2, this.c, takVarB2.f());
                    }
                    this.b.add(takVarB2);
                    this.c = takVarB2.f();
                    takVarB2.e();
                }
            }
            return this.c > j;
        } catch (Exception e) {
            if (!this.g) {
                throw e;
            }
        }
    }
}
