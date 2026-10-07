package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jyd extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ nyd f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ List i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ i6a m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyd(nyd nydVar, boolean z, String str, List list, int i, int i2, boolean z2, i6a i6aVar, long j, long j2, boolean z3, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = nydVar;
        this.g = z;
        this.h = str;
        this.i = list;
        this.j = i;
        this.k = i2;
        this.l = z2;
        this.m = i6aVar;
        this.n = j;
        this.o = j2;
        this.p = z3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new jyd(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((jyd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        bxg ywgVar;
        String strK;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            ghb ghbVar = ew5.b;
            long jG = ew5.g(qe7.O(((Number) this.f.s.getValue()).intValue(), lw5.HOURS));
            nyd nydVar = this.f;
            String str = nydVar.f;
            boolean z = this.l;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    Object obj2 = nydVar.c;
                    if (gm0.c()) {
                        strK = obj2.toString();
                    } else if (obj2 instanceof Collection) {
                        Collection collection = (Collection) obj2;
                        if (collection.isEmpty()) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(collection.size(), "[**", "**]");
                        }
                    } else if (obj2 instanceof Map) {
                        Map map = (Map) obj2;
                        strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        if (objArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(objArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof int[]) {
                        int[] iArr = (int[]) obj2;
                        if (iArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(iArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof float[]) {
                        float[] fArr = (float[]) obj2;
                        if (fArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(fArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof long[]) {
                        long[] jArr = (long[]) obj2;
                        if (jArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(jArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof double[]) {
                        double[] dArr = (double[]) obj2;
                        if (dArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(dArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof short[]) {
                        short[] sArr = (short[]) obj2;
                        if (sArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(sArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        if (bArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(bArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof char[]) {
                        char[] cArr = (char[]) obj2;
                        if (cArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(cArr.length, "[**", "**]");
                        }
                    } else if (obj2 instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj2;
                        if (zArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(zArr.length, "[**", "**]");
                        }
                    } else {
                        strK = "***";
                    }
                    Object value = nydVar.s.getValue();
                    StringBuilder sbA = zo5.A("onPublishClick: path=", strK, ", isVideo=", ", ttl=", z);
                    sbA.append(value);
                    sbA.append("h, expirationMs=");
                    sbA.append(jG);
                    a4cVar.c(je9Var, str, sbA.toString(), null);
                }
            }
            if (this.g) {
                String str2 = this.h;
                if (str2 == null) {
                    return sbiVar;
                }
                ywgVar = new zwg(this.f.w == ((long) R.id.oneme_stories_preset_whitelist_my_contacts_item) ? 2 : 1, jG, ksl.a(this.i), this.j, this.k, null, null, str2, 193);
            } else {
                boolean z2 = this.l;
                nyd nydVar2 = this.f;
                String str3 = nydVar2.c;
                if (z2) {
                    ywgVar = new axg(str3, nydVar2.w == ((long) R.id.oneme_stories_preset_whitelist_my_contacts_item) ? 2 : 1, jG, ksl.a(this.i), this.j, this.k, this.m, null, this.n, this.o, this.p);
                } else {
                    ywgVar = new ywg(str3, nydVar2.w == ((long) R.id.oneme_stories_preset_whitelist_my_contacts_item) ? 2 : 1, jG, ksl.a(this.i), this.j, this.k, this.m, null);
                }
            }
            g1h g1hVar = (g1h) this.f.i.getValue();
            zyg zygVar = new zyg(((s7f) ((et3) this.f.k.getValue())).t());
            ha9 ha9Var = this.f.e;
            this.e = 1;
            if (g1hVar.b(zygVar, ywgVar, ha9Var, this) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        ic6 ic6Var = this.f.g;
        psg.b.getClass();
        a8j.x(ic6Var, new i65(":chat-list"));
        return sbiVar;
    }
}
