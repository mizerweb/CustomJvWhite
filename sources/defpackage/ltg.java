package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ltg {
    public final ny8 a;
    public final ny8 b;
    public final String c = ltg.class.getName();

    public ltg(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(long j, nq4 nq4Var) {
        htg htgVar;
        long j2;
        if (nq4Var instanceof htg) {
            htgVar = (htg) nq4Var;
            int i = htgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                htgVar.g = i - Integer.MIN_VALUE;
            } else {
                htgVar = new htg(this, nq4Var);
            }
        } else {
            htgVar = new htg(this, nq4Var);
        }
        htg htgVar2 = htgVar;
        Object obj = htgVar2.e;
        hu4 hu4Var = hu4.a;
        int i2 = htgVar2.g;
        if (i2 == 0) {
            ch3.d0(obj);
            yzg yzgVarG = g();
            w0h w0hVar = w0h.CANCELED;
            Set setP1 = a.p1(new w0h[]{w0h.PENDING, w0h.PREPARED, w0h.UPLOADING, w0h.UPLOADED, w0h.UPLOAD_FAILED, w0h.PUBLISHING_FAILED});
            htgVar2.d = j;
            htgVar2.g = 1;
            if (yzgVarG.a(j, w0hVar, setP1, htgVar2) == hu4Var) {
                return hu4Var;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = htgVar2.d;
            ch3.d0(obj);
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j2, "Canceled all pending entities for draft "), null);
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(long j, u8b u8bVar, boolean z, nq4 nq4Var) {
        itg itgVar;
        long j2;
        if (nq4Var instanceof itg) {
            itgVar = (itg) nq4Var;
            int i = itgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                itgVar.g = i - Integer.MIN_VALUE;
            } else {
                itgVar = new itg(this, nq4Var);
            }
        } else {
            itgVar = new itg(this, nq4Var);
        }
        Object objI = itgVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = itgVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            ArrayList arrayList = new ArrayList(u8bVar.b);
            Object[] objArr = u8bVar.a;
            int i3 = u8bVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(new zzg(j, i4, osl.a(), ((File) objArr[i4]).getAbsolutePath(), z));
            }
            yzg yzgVarG = g();
            j2 = j;
            itgVar.d = j2;
            itgVar.g = 1;
            objI = ch3.I(itgVar, yzgVarG.a, false, true, new bad(yzgVarG, 16, arrayList));
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = itgVar.d;
            ch3.d0(objI);
            j2 = j3;
        }
        List list = (List) objI;
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Created " + list.size() + " publish entities for draft " + j2, null);
            }
        }
        return objI;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(long j, nq4 nq4Var) {
        jtg jtgVar;
        List list;
        Object objI;
        List list2;
        String str;
        a4c a4cVar;
        long j2 = j;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.e;
        if (nq4Var instanceof jtg) {
            jtgVar = (jtg) nq4Var;
            int i = jtgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtgVar.h = i - Integer.MIN_VALUE;
            } else {
                jtgVar = new jtg(this, nq4Var);
            }
        } else {
            jtgVar = new jtg(this, nq4Var);
        }
        Object objI2 = jtgVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = jtgVar.h;
        if (i2 == 0) {
            ch3.d0(objI2);
            yzg yzgVarG = g();
            jtgVar.d = j2;
            jtgVar.h = 1;
            objI2 = ch3.I(jtgVar, yzgVarG.a, true, false, new uy6(j2, yzgVarG, 4));
            if (objI2 != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j2 = jtgVar.d;
            ch3.d0(objI2);
        } else {
            if (i2 == 2) {
                j2 = jtgVar.d;
                ch3.d0(objI2);
                list = (List) objI2;
                yzg yzgVarG2 = g();
                jtgVar.e = list;
                jtgVar.d = j2;
                jtgVar.h = 3;
                yzgVarG2.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM story_publish WHERE publish_id IN (");
                objI = ch3.I(jtgVar, yzgVarG2.a, false, true, new yn6(4, nbh.x(")", sb, list), list));
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI != hu4Var) {
                    list2 = list;
                }
                return hu4Var;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = jtgVar.d;
            list2 = jtgVar.e;
            ch3.d0(objI2);
        }
        str = this.c;
        a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Deleted publish entities (count=" + list2.size() + ") older than " + j2, null);
        }
        return sbiVar;
        List list3 = (List) objI2;
        String str2 = this.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Start deleting publish entities (count=" + list3.size() + ") older than " + j2, null);
        }
        jtgVar.d = j2;
        jtgVar.h = 2;
        objI2 = yab.K0(((n0c) ((xhh) this.b.getValue())).b(), new y73(list3, (lq4) null, 17), jtgVar);
        if (objI2 != hu4Var) {
            list = (List) objI2;
            yzg yzgVarG3 = g();
            jtgVar.e = list;
            jtgVar.d = j2;
            jtgVar.h = 3;
            yzgVarG3.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DELETE FROM story_publish WHERE publish_id IN (");
            objI = ch3.I(jtgVar, yzgVarG3.a, false, true, new yn6(4, nbh.x(")", sb2, list), list));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
                list2 = list;
                str = this.c;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4cVar.c(je9Var, str, "Deleted publish entities (count=" + list2.size() + ") older than " + j2, null);
                }
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(long j, nq4 nq4Var) {
        ktg ktgVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ktg) {
            ktgVar = (ktg) nq4Var;
            int i = ktgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktgVar.g = i - Integer.MIN_VALUE;
            } else {
                ktgVar = new ktg(this, nq4Var);
            }
        } else {
            ktgVar = new ktg(this, nq4Var);
        }
        Object obj = ktgVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ktgVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            yzg yzgVarG = g();
            List listS = c0a.s(j);
            ktgVar.d = j;
            ktgVar.g = 1;
            yzgVarG.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM story_publish WHERE draft_id IN (");
            Object objI = ch3.I(ktgVar, yzgVarG.a, false, true, new tj1(8, nbh.x(")", sb, listS), listS));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ktgVar.d;
            ch3.d0(obj);
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "Deleted publish entities for draft "), null);
            }
        }
        return sbiVar;
    }

    public final Object e(long j, nq4 nq4Var) {
        yzg yzgVarG = g();
        Object objI = ch3.I(nq4Var, yzgVarG.a, false, true, new aa2(yzgVarG, j));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object f(long j, mdh mdhVar) {
        yzg yzgVarG = g();
        return ch3.I(mdhVar, yzgVarG.a, true, false, new aa2(j, yzgVarG, 24));
    }

    public final yzg g() {
        return (yzg) this.a.getValue();
    }

    public final Object h(long j, w0h w0hVar, nq4 nq4Var) {
        yzg yzgVarG = g();
        Object objI = ch3.I(nq4Var, yzgVarG.a, false, true, new en3(yzgVarG, w0hVar, j));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object i(long j, w0h w0hVar, Set set, mdh mdhVar) {
        Object objA = g().a(j, w0hVar, set, mdhVar);
        return objA == hu4.a ? objA : sbi.a;
    }
}
