package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import one.me.qrscanner.QrScannerWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class l07 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l07(yx6 yx6Var, Object obj, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if (r3.emit(r0, r10) == r15) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(defpackage.lq4 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l07.b(lq4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object d(lq4 lq4Var, Object obj) {
        kwd kwdVar;
        if (lq4Var instanceof kwd) {
            kwdVar = (kwd) lq4Var;
            int i = kwdVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kwdVar.e = i - Integer.MIN_VALUE;
            } else {
                kwdVar = new kwd(this, lq4Var);
            }
        } else {
            kwdVar = new kwd(this, lq4Var);
        }
        Object obj2 = kwdVar.d;
        int i2 = kwdVar.e;
        yl ylVar = null;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            jl jlVar = (jl) obj;
            if (jlVar != null) {
                String str = jlVar.c;
                ylVar = new yl(((sf8) this.c).c, (str == null || str.length() == 0) ? 3 : 1, jlVar.a, jlVar.e, jlVar.c);
            }
            if (ylVar != null) {
                kwdVar.e = 1;
                Object objEmit = yx6Var.emit(ylVar, kwdVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(lq4 lq4Var, Object obj) {
        v0e v0eVar;
        if (lq4Var instanceof v0e) {
            v0eVar = (v0e) lq4Var;
            int i = v0eVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0eVar.e = i - Integer.MIN_VALUE;
            } else {
                v0eVar = new v0e(this, lq4Var);
            }
        } else {
            v0eVar = new v0e(this, lq4Var);
        }
        Object obj2 = v0eVar.d;
        int i2 = v0eVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            i0e i0eVar = (i0e) obj;
            boolean z = i0eVar instanceof h0e;
            boolean z2 = false;
            boolean z3 = z && ((h0e) i0eVar).b;
            if (z && !((h0e) i0eVar).b && ((QrScannerWidget) this.c).u) {
                z2 = true;
            }
            if (!z || z3 || z2) {
                v0eVar.e = 1;
                Object objEmit = yx6Var.emit(obj, v0eVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(lq4 lq4Var, Object obj) {
        p4f p4fVar;
        if (lq4Var instanceof p4f) {
            p4fVar = (p4f) lq4Var;
            int i = p4fVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p4fVar.e = i - Integer.MIN_VALUE;
            } else {
                p4fVar = new p4f(this, lq4Var);
            }
        } else {
            p4fVar = new p4f(this, lq4Var);
        }
        Object obj2 = p4fVar.d;
        int i2 = p4fVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            long jLongValue = ((Number) obj).longValue();
            m4f m4fVar = ((t4f) ((s4f) this.c).k.getValue()).b;
            if (m4fVar != null && jLongValue == m4fVar.c.a) {
                p4fVar.e = 1;
                Object objEmit = yx6Var.emit(obj, p4fVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object g(lq4 lq4Var, Object obj) {
        mdf mdfVar;
        x0c x0cVar = (x0c) this.c;
        if (lq4Var instanceof mdf) {
            mdfVar = (mdf) lq4Var;
            int i = mdfVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdfVar.e = i - Integer.MIN_VALUE;
            } else {
                mdfVar = new mdf(this, lq4Var);
            }
        } else {
            mdfVar = new mdf(this, lq4Var);
        }
        Object obj2 = mdfVar.d;
        int i2 = mdfVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            List list = (List) obj;
            c79 c79Var = new c79(list.size() + (x0cVar != null ? 1 : 0));
            if (x0cVar != null) {
                c79Var.add(x0cVar);
            }
            c79Var.addAll(list);
            c79 c79VarJ = yab.j(c79Var);
            mdfVar.e = 1;
            Object objEmit = yx6Var.emit(c79VarJ, mdfVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(lq4 lq4Var, Object obj) {
        eff effVar;
        if (lq4Var instanceof eff) {
            effVar = (eff) lq4Var;
            int i = effVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                effVar.e = i - Integer.MIN_VALUE;
            } else {
                effVar = new eff(this, lq4Var);
            }
        } else {
            effVar = new eff(this, lq4Var);
        }
        Object obj2 = effVar.d;
        int i2 = effVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            ylc ylcVar = (ylc) obj;
            boolean zBooleanValue = ((Boolean) ylcVar.a).booleanValue();
            igf igfVar = (zBooleanValue || ((hff) this.c).d.E()) ? igf.a : igf.b;
            effVar.e = 1;
            Object objEmit = yx6Var.emit(igfVar, effVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object j(lq4 lq4Var, Object obj) {
        zof zofVar;
        if (lq4Var instanceof zof) {
            zofVar = (zof) lq4Var;
            int i = zofVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zofVar.e = i - Integer.MIN_VALUE;
            } else {
                zofVar = new zof(this, lq4Var);
            }
        } else {
            zofVar = new zof(this, lq4Var);
        }
        Object obj2 = zofVar.d;
        int i2 = zofVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            ylc ylcVar = new ylc((ha9) this.c, new Integer(((ou4) obj).a));
            zofVar.e = 1;
            Object objEmit = yx6Var.emit(ylcVar, zofVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object l(lq4 lq4Var, Object obj) {
        jwf jwfVar;
        if (lq4Var instanceof jwf) {
            jwfVar = (jwf) lq4Var;
            int i = jwfVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwfVar.e = i - Integer.MIN_VALUE;
            } else {
                jwfVar = new jwf(this, lq4Var);
            }
        } else {
            jwfVar = new jwf(this, lq4Var);
        }
        Object obj2 = jwfVar.d;
        int i2 = jwfVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            a81 a81Var = (a81) obj;
            Context context = ((kwf) this.c).c;
            ArrayList arrayList = new ArrayList();
            if (!a81Var.b.isEmpty()) {
                int i3 = 0;
                for (Object obj3 : a81Var.b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    r71 r71Var = (r71) obj3;
                    int i5 = i3 != 0 ? 2 : 1;
                    isf isfVar = new isf(new xnh(woh.v(r71Var.b, true, context)), null);
                    s71 s71Var = r71Var.a;
                    arrayList.add(new mbf(i5, new tnh(s71Var.d), s71Var.a, isfVar));
                    i3 = i4;
                }
                arrayList.add(new lbf(new tnh(R.string.oneme_settings_storage_clear_cache), R.id.oneme_settings_storage_item_clear_cache, new xnh(woh.v(a81Var.a, true, context))));
            }
            jwfVar.e = 1;
            Object objEmit = yx6Var.emit(arrayList, jwfVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x020e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0210  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x0238  */
    /* JADX WARN: Code duplicated, block: B:145:0x0280  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:199:0x036c  */
    /* JADX WARN: Code duplicated, block: B:225:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:246:0x042b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0482  */
    /* JADX WARN: Code duplicated, block: B:289:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:301:0x0550  */
    /* JADX WARN: Code duplicated, block: B:306:0x0581  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:378:0x0730  */
    /* JADX WARN: Code duplicated, block: B:420:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:421:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:432:0x081f  */
    /* JADX WARN: Code duplicated, block: B:449:0x0880  */
    /* JADX WARN: Code duplicated, block: B:514:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:556:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0220, code lost:
    
        if (r0.emit(r2, r4) == r5) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r0.emit(r2, r3) == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0807, code lost:
    
        if (r0.emit(r1, r4) == r5) goto L424;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r30, defpackage.lq4 r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l07.emit(java.lang.Object, lq4):java.lang.Object");
    }

    public /* synthetic */ l07(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
