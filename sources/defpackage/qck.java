package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public class qck {
    public static final t81 h = new t81(4);
    public final f8k a;
    public final w4k b;
    public final fak c;
    public final l5b d;
    public final s8 e;
    public volatile boolean f;
    public y81 g;

    public qck(f8k f8kVar, w4k w4kVar, fak fakVar, l5b l5bVar) {
        this(f8kVar, w4kVar, fakVar, l5bVar, new s8());
    }

    public pbk a(byte[] bArr, byte[] bArr2) {
        pbk kbkVar;
        int i = pck.a[this.b.ordinal()];
        if (i == 1) {
            kbkVar = new kbk(this.a.a, bArr, bArr2);
        } else if (i == 2) {
            e8k e8kVar = this.a.a;
            kbkVar = new rbk();
            kbkVar.a = e8kVar;
            kbkVar.e = bArr2;
            kbkVar.c = new ArrayList();
        } else {
            if (i != 3) {
                hs4.b();
                return null;
            }
            kbkVar = new tbk(this.a.a, bArr, bArr2);
        }
        s8 s8Var = this.e;
        long j = s8Var.a;
        s8Var.a = 1 + j;
        if (j >= 0) {
            kbkVar.b = j;
            return kbkVar;
        }
        ore.a();
        return null;
    }

    public Optional b(byte[] bArr, int i, byte[] bArr2, int i2) {
        boolean z;
        boolean z2;
        e5k e5kVar;
        Optional optionalOf;
        y81 y81Var;
        int iMin = Integer.min(i, i2);
        pbk pbkVarA = a(bArr, bArr2);
        ArrayList arrayList = new ArrayList();
        fak fakVar = this.c;
        Instant instant = fakVar.a.instant();
        synchronized (fakVar.e) {
            try {
                Instant instant2 = fakVar.f;
                z = false;
                z2 = instant2 != null && (instant.isAfter(instant2) || Duration.between(instant, fakVar.f).toMillis() < 1);
                if (z2) {
                    fakVar.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && this.d.e()) {
            e5kVar = (e5k) this.d.f().get();
            if (pbkVarA.b(e5kVar.a()) > i2) {
                fak fakVar2 = this.c;
                synchronized (fakVar2.e) {
                    fakVar2.f = fakVar2.a.instant();
                }
                return Optional.empty();
            }
            pbkVarA.f(e5kVar);
            arrayList.add(h);
            this.d.b(e5kVar, pbkVarA.p().longValue());
        } else {
            e5kVar = null;
        }
        int iA = (e5kVar != null || this.c.c.isEmpty() || !this.d.d() || (e5kVar = (e5k) this.d.f().orElse(null)) == null) ? 0 : e5kVar.a();
        List list = (List) this.c.d.peekFirst();
        if (list != null && !list.isEmpty()) {
            List listA = this.c.a();
            if (pbkVarA.b(listA.stream().mapToInt(new ao8(16)).sum()) > i2) {
                n8k n8kVar = new n8k();
                if (pbkVarA.b(1) > i2) {
                    return Optional.empty();
                }
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = new Object[]{n8kVar}[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                listA = Collections.unmodifiableList(arrayList2);
            }
            pbkVarA.f = true;
            pbkVarA.c.addAll(listA);
            return Optional.of(new rck(pbkVarA));
        }
        if (!this.c.c.isEmpty()) {
            int iB = pbkVarA.b(1000) - 1000;
            while (iB < iMin) {
                int i3 = iMin - iB;
                int i4 = i3 - iA;
                Optional optionalB = this.c.b(i4);
                if (optionalB.isPresent() || iA <= 0) {
                    i3 = i4;
                } else {
                    optionalB = this.c.b(i3);
                }
                if (!optionalB.isPresent()) {
                    break;
                }
                o8k o8kVarC = ((eak) optionalB.get()).c(i3);
                if (o8kVarC != null) {
                    if (o8kVarC.a() > i3) {
                        StringBuilder sbP = qv1.p("supplier does not produce frame of right (max) size: ", o8kVarC.a(), " > ", i3, " frame: ");
                        sbP.append(o8kVarC);
                        throw new RuntimeException(sbP.toString());
                    }
                    int iA2 = o8kVarC.a() + iB;
                    pbkVarA.f(o8kVarC);
                    arrayList.add(((eak) optionalB.get()).b());
                    if (iA <= 0 || iA2 + iA > iMin) {
                        iB = iA2;
                    } else {
                        pbkVarA.f(e5kVar);
                        arrayList.add(h);
                        this.d.b(e5kVar, pbkVarA.p().longValue());
                        iB = e5kVar.a() + iA2;
                        iA = 0;
                    }
                }
            }
        }
        if (!this.c.d.isEmpty() && pbkVarA.c.isEmpty()) {
            this.c.a();
            pbkVarA.f = true;
            pbkVarA.f(new n8k());
            arrayList.add(h);
        }
        if (pbkVarA.c.isEmpty()) {
            this.e.a--;
            optionalOf = Optional.empty();
        } else {
            if (pbkVarA.c.size() != arrayList.size()) {
                c.t();
                return null;
            }
            optionalOf = Optional.of(new rck(pbkVarA, new ock(0, arrayList)));
        }
        if (this.f) {
            fak fakVar3 = this.c;
            synchronized (fakVar3.e) {
                try {
                    if (fakVar3.c.isEmpty() && fakVar3.f == null) {
                        z = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z && (y81Var = this.g) != null) {
                y81Var.accept(this);
                return optionalOf;
            }
        }
        return optionalOf;
    }

    public final String toString() {
        return "PacketAssembler[" + this.b + "]";
    }

    public qck(f8k f8kVar, w4k w4kVar, fak fakVar, l5b l5bVar, s8 s8Var) {
        this.a = f8kVar;
        this.b = w4kVar;
        this.c = fakVar;
        this.d = l5bVar;
        this.e = s8Var;
    }
}
