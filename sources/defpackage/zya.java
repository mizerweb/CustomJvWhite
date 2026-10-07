package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zya extends pza {
    public final ha9 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ifh k;

    public zya(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ha9 ha9Var) {
        super(ny8Var);
        this.e = ha9Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var4;
        this.k = new ifh(new x5(ny8Var2, 22, this));
    }

    @Override // defpackage.pza
    public final Object b() {
        List list = (List) this.b.get();
        wf8 wf8Var = new wf8();
        int size = list.size();
        vf8[] vf8VarArr = new vf8[size];
        for (int i = 0; i < size; i++) {
            yya yyaVar = (yya) list.get(i);
            vf8 vf8Var = new vf8();
            try {
                vf8Var.a = yyaVar.a;
                vf8Var.b = yyaVar.b.toString();
                CharSequence charSequence = yyaVar.c;
                String string = charSequence != null ? charSequence.toString() : null;
                String str = "";
                if (string == null) {
                    string = "";
                }
                vf8Var.c = string;
                vf8Var.d = yyaVar.d;
                Object[] objArr = yyaVar.e;
                if (objArr != null) {
                    vf8Var.q = (ag8[]) objArr;
                }
                String str2 = yyaVar.g;
                if (str2 == null) {
                    str2 = "";
                }
                vf8Var.e = str2;
                vf8Var.f = yyaVar.h;
                vf8Var.g = yyaVar.i;
                vf8Var.h = yyaVar.j;
                vf8Var.i = yyaVar.k;
                vf8Var.j = yyaVar.l;
                vf8Var.k = yyaVar.m;
                vf8Var.l = yyaVar.n;
                Long l = yyaVar.o;
                vf8Var.m = l != null ? l.longValue() : -1L;
                String str3 = yyaVar.r;
                if (str3 == null) {
                    str3 = "";
                }
                vf8Var.n = str3;
                byte[] bArr = yyaVar.s;
                if (bArr == null) {
                    bArr = sb8.i;
                }
                vf8Var.o = bArr;
                CharSequence charSequence2 = yyaVar.f;
                String string2 = charSequence2 != null ? charSequence2.toString() : null;
                if (string2 != null) {
                    str = string2;
                }
                vf8Var.p = str;
                vf8Var.r = yyaVar.p;
                vf8Var.s = yyaVar.q.toString();
                vf8Var.t = yyaVar.u;
            } catch (Throwable th) {
                gm0.V(yya.class.getName(), "toProto error", th);
            }
            vf8VarArr[i] = vf8Var;
        }
        wf8Var.a = vf8VarArr;
        return wf8Var;
    }

    @Override // defpackage.pza
    public final f40 c() {
        return (f40) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    @Override // defpackage.pza
    public final boolean e(byte[] bArr) {
        Object poeVar;
        Object poeVar2;
        je9 je9Var = je9.e;
        File file = new File(ju6.d(((ju6) ((rs6) this.f.getValue())).c), this.e.a("chats_v1", null));
        try {
            poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object obj = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = obj;
        }
        if (((Boolean) poeVar).booleanValue()) {
            String strD = d();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strD, "prev file " + file + " deleted!", null);
            }
        }
        long jNanoTime = System.nanoTime();
        String strD2 = d();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, strD2, "loadData start", null);
        }
        taa taaVar = ((b78) this.g.getValue()).f;
        try {
            wf8 wf8Var = (wf8) sia.mergeFrom(new wf8(), bArr);
            int length = wf8Var.a.length;
            ArrayList arrayList = new ArrayList(length);
            Object[] objArr = length == 0 ? cqb.a : new Object[length];
            vf8[] vf8VarArr = wf8Var.a;
            int length2 = vf8VarArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                yya yyaVarA = iml.a(vf8VarArr[i], new g3(19, this));
                arrayList.add(yyaVarA);
                String str = yyaVarA.r;
                if (str == null) {
                    vf8VarArr = vf8VarArr;
                } else {
                    v78 v78VarK = ghb.k(str, awb.a);
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        int length3 = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i3, (length3 * 3) / 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length3);
                        objArr = objArr2;
                    }
                    objArr[i2] = v78VarK;
                    j85 j85Var = ((b78) this.g.getValue()).h;
                    qe7.v();
                    ay0 ay0VarP = v78VarK.o != null ? j85Var.p(v78VarK, this) : j85Var.m(v78VarK, this);
                    byte[] bArr2 = yyaVarA.s;
                    if (bArr2 != null) {
                        ((hy0) this.i.getValue()).getClass();
                        Bitmap bitmapA = hy0.a(bArr2);
                        if (bitmapA != null && oy0.d(bitmapA) != 0) {
                            au3 au3VarB = taaVar.b(ay0VarP, au3.Y(CloseableStaticBitmap.of(bitmapA, (fy0) this.j.getValue(), s98.d, 0)));
                            if (au3VarB != null) {
                                au3VarB.close();
                            }
                        }
                    }
                    i2 = i3;
                }
                i++;
                vf8VarArr = vf8VarArr;
            }
            this.b.set(arrayList);
            for (int i4 = 0; i4 < i2; i4++) {
                ((b78) this.g.getValue()).d((v78) objArr[i4], this);
            }
            poeVar2 = Boolean.TRUE;
        } catch (Throwable th2) {
            poeVar2 = new poe(th2);
        }
        Throwable thA = roe.a(poeVar2);
        if (thA != null) {
            gm0.V(d(), "fail to parse", thA);
        }
        String strD3 = d();
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            ghb ghbVar = ew5.b;
            a4cVar3.c(je9Var, strD3, "loadData finish ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime, lw5.NANOSECONDS))), null);
        }
        Boolean bool = Boolean.FALSE;
        if (poeVar2 instanceof poe) {
            poeVar2 = bool;
        }
        return ((Boolean) poeVar2).booleanValue();
    }
}
