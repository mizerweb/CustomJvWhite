package defpackage;

import android.net.Uri;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class iz5 extends a8j {
    public static final /* synthetic */ zv8[] B = {new z8b(iz5.class, "handleCreatePreviewStateChangeJob", "getHandleCreatePreviewStateChangeJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, iz5.class, "handleSendClickJob", "getHandleSendClickJob()Lkotlinx/coroutines/Job;"), new z8b(iz5.class, "handleSendLongClickJob", "getHandleSendLongClickJob()Lkotlinx/coroutines/Job;"), new z8b(iz5.class, "handleSendScheduledClickJob", "getHandleSendScheduledClickJob()Lkotlinx/coroutines/Job;"), new z8b(iz5.class, "handleNavigationJob", "getHandleNavigationJob()Lkotlinx/coroutines/Job;")};
    public static final long C;
    public final p7h A;
    public final dy5 c;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final o56 u;
    public final mjg v;
    public final r8e w;
    public final pzf x;
    public final pzf y;
    public final pzf z;
    public final String d = iz5.class.getName();
    public final p3c p = qyj.S();
    public final p3c q = qyj.S();
    public final p3c r = qyj.S();
    public final p3c s = qyj.S();
    public final p3c t = qyj.S();

    static {
        ghb ghbVar = ew5.b;
        C = qe7.O(250, lw5.MILLISECONDS);
    }

    public iz5(dy5 dy5Var, Uri uri, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11) {
        this.c = dy5Var;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.m = ny8Var9;
        this.n = ny8Var10;
        this.o = ny8Var11;
        o56 o56Var = new o56();
        this.u = o56Var;
        mjg mjgVarA = p90.a(xy5.a);
        this.v = mjgVarA;
        int i = 1;
        lq4 lq4Var = null;
        int i2 = 2;
        j3 j3VarC = e9i.C(mjgVarA, new tz(5, new xy6(new n94(i, new us5(i)), uw8.f, null)), new tz(5, new xy6(new n94(i, new us5(i2)), o56Var.c, null)), new bd1(4, lq4Var, i2));
        byte b = 0;
        az5 az5Var = new az5(false, 63);
        this.w = e9i.G0(j3VarC, this.b, j0g.a, az5Var);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.x = pzfVarB;
        this.y = pzfVarB;
        pzf pzfVarB2 = e9i.b(0, 0, 7);
        this.z = pzfVarB2;
        this.A = new p7h(pzfVarB2, new qc5(this, lq4Var, 5));
        if (uri == null) {
            a8j.t(this, null, new fz5(this, lq4Var, b == true ? 1 : 0), 3);
        } else if (z) {
            mjgVarA.j(null, new wy5(uri, false));
        } else {
            F(uri);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(iz5 iz5Var, Uri uri, nq4 nq4Var) {
        dz5 dz5Var;
        if (nq4Var instanceof dz5) {
            dz5Var = (dz5) nq4Var;
            int i = dz5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dz5Var.g = i - Integer.MIN_VALUE;
            } else {
                dz5Var = new dz5(nq4Var);
            }
        } else {
            dz5Var = new dz5(nq4Var);
        }
        Object objV = dz5Var.f;
        int i2 = dz5Var.g;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3VarH = iz5Var.H();
            long j = iz5Var.c.a;
            dz5Var.d = iz5Var;
            dz5Var.e = uri;
            dz5Var.g = 1;
            objV = xn3VarH.v(j, dz5Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = dz5Var.e;
            iz5Var = dz5Var.d;
            ch3.d0(objV);
        }
        return new yy5(uri, false, !((rt2) objV).k0((e5d) iz5Var.j.getValue()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object C(iz5 iz5Var, Uri uri, Uri uri2, mdh mdhVar) {
        String strK;
        int length;
        sbi sbiVar = sbi.a;
        if (cqk.d(uri.getPath(), uri2.getPath())) {
            String str = iz5Var.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    if (gm0.c()) {
                        strK = uri.toString();
                    } else if (uri instanceof Collection) {
                        Collection collection = (Collection) uri;
                        if (collection.isEmpty()) {
                            strK = "[]";
                        } else {
                            length = collection.size();
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof Map) {
                        Map map = (Map) uri;
                        strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                    } else if (uri instanceof Object[]) {
                        Object[] objArr = (Object[]) uri;
                        if (objArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = objArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof int[]) {
                        int[] iArr = (int[]) uri;
                        if (iArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = iArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof float[]) {
                        float[] fArr = (float[]) uri;
                        if (fArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = fArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof long[]) {
                        long[] jArr = (long[]) uri;
                        if (jArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = jArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof double[]) {
                        double[] dArr = (double[]) uri;
                        if (dArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = dArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof short[]) {
                        short[] sArr = (short[]) uri;
                        if (sArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = sArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof byte[]) {
                        byte[] bArr = (byte[]) uri;
                        if (bArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = bArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof char[]) {
                        char[] cArr = (char[]) uri;
                        if (cArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = cArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (uri instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) uri;
                        if (zArr.length == 0) {
                            strK = "[]";
                        } else {
                            length = zArr.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else {
                        strK = "***";
                    }
                    a4cVar.c(je9Var, str, c0a.o("File ", strK, " is not deleted as it's still used"), null);
                }
            }
        } else {
            Object objG = iz5Var.G(uri, mdhVar);
            if (objG == hu4.a) {
                return objG;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(iz5 iz5Var, Uri uri, nq4 nq4Var) {
        ez5 ez5Var;
        if (nq4Var instanceof ez5) {
            ez5Var = (ez5) nq4Var;
            int i = ez5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ez5Var.f = i - Integer.MIN_VALUE;
            } else {
                ez5Var = new ez5(iz5Var, nq4Var);
            }
        } else {
            ez5Var = new ez5(iz5Var, nq4Var);
        }
        Object objK0 = ez5Var.d;
        int i2 = ez5Var.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            xt4 xt4VarB = ((n0c) ((xhh) iz5Var.e.getValue())).b();
            vk4 vk4Var = new vk4(iz5Var, uri, lq4Var, 12);
            ez5Var.f = 1;
            objK0 = yab.K0(xt4VarB, vk4Var, ez5Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return objK0;
    }

    public static final Object E(iz5 iz5Var, mdh mdhVar) {
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        int i = uw8.a;
        if (uw8.b(uw8.c)) {
            String str = iz5Var.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "requestKeyboardClose: keyboard is opened, requesting close", null);
            }
            Object objEmit = iz5Var.x.emit(oy5.a, mdhVar);
            return objEmit == hu4.a ? objEmit : sbiVar;
        }
        boolean zBooleanValue = ((Boolean) iz5Var.u.c.a.invoke()).booleanValue();
        String str2 = iz5Var.d;
        if (!zBooleanValue) {
            gm0.Y(str2, "requestKeyboardClose: none of keyboards was opened");
            return sbiVar;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "requestKeyboardClose: emoji keyboard is opened, requesting close", null);
        }
        iz5Var.u.a(yka.a);
        return sbiVar;
    }

    public final void F(Uri uri) {
        mjg mjgVar = this.v;
        zy5 zy5Var = (zy5) mjgVar.getValue();
        boolean z = zy5Var instanceof xy5;
        zv8[] zv8VarArr = B;
        p3c p3cVar = this.p;
        int i = 1;
        int i2 = 0;
        lq4 lq4Var = null;
        if (z) {
            p3cVar.B(this, zv8VarArr[0], a8j.t(this, null, new cz5(this, uri, lq4Var, i2), 1));
            return;
        }
        if (zy5Var instanceof wy5) {
            p3cVar.B(this, zv8VarArr[0], a8j.t(this, null, new cz5(this, uri, lq4Var, i), 1));
            a8j.t(this, null, new jd3((wy5) zy5Var, uri, this, lq4Var, 24), 3);
        } else {
            if (!(zy5Var instanceof yy5)) {
                ore.o();
                return;
            }
            yy5 yy5Var = (yy5) zy5Var;
            mjgVar.j(null, yy5.a(yy5Var, uri, false, 6));
            a8j.t(this, null, new jd3(yy5Var, uri, this, lq4Var, 25), 3);
        }
    }

    public final Object G(Uri uri, mdh mdhVar) {
        return yab.K0(((n0c) ((xhh) this.e.getValue())).b(), new ke3(uri, this, null, 24), mdhVar);
    }

    public final xn3 H() {
        return (xn3) this.h.getValue();
    }

    public final void I() {
        String str = this.d;
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onCloseClicked", null);
            }
        }
        zy5 zy5Var = (zy5) this.v.getValue();
        if (zy5Var instanceof xy5) {
            return;
        }
        int i = 0;
        if (zy5Var instanceof wy5) {
            a8j.t(this, null, new bz5(this, ((wy5) zy5Var).a, lq4Var, i), 3);
        } else if (!(zy5Var instanceof yy5)) {
            ore.o();
        } else {
            if (((yy5) zy5Var).b) {
                return;
            }
            a8j.t(this, null, new gz5(this, lq4Var, i), 3);
        }
    }

    public final void J(yka ykaVar) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onEmojiClick", null);
            }
        }
        this.u.a(ykaVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0196  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void K(CharSequence charSequence, Long l) {
        String strK;
        Long l2;
        String string;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        String str = this.d;
        a4c a4cVar = gm0.f;
        String strK2 = "***";
        if (a4cVar != null && a4cVar.b(je9Var2)) {
            if (charSequence == 0) {
                strK = null;
            } else if (gm0.c()) {
                strK = charSequence.toString();
            } else if (charSequence instanceof Collection) {
                Collection collection = (Collection) charSequence;
                if (collection.isEmpty()) {
                    strK = "[]";
                } else {
                    strK = c0a.k(collection.size(), "[**", "**]");
                }
            } else if (charSequence instanceof Map) {
                Map map = (Map) charSequence;
                strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
            } else if (charSequence instanceof Object[]) {
                Object[] objArr = (Object[]) charSequence;
                if (objArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(objArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof int[]) {
                int[] iArr = (int[]) charSequence;
                if (iArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(iArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof float[]) {
                float[] fArr = (float[]) charSequence;
                if (fArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(fArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof long[]) {
                long[] jArr = (long[]) charSequence;
                if (jArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(jArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof double[]) {
                double[] dArr = (double[]) charSequence;
                if (dArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(dArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof short[]) {
                short[] sArr = (short[]) charSequence;
                if (sArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(sArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof byte[]) {
                byte[] bArr = (byte[]) charSequence;
                if (bArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(bArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof char[]) {
                char[] cArr = (char[]) charSequence;
                if (cArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(cArr.length, "[**", "**]");
                }
            } else if (charSequence instanceof boolean[]) {
                boolean[] zArr = (boolean[]) charSequence;
                if (zArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(zArr.length, "[**", "**]");
                }
            } else {
                strK = "***";
            }
            StringBuilder sb = new StringBuilder("onSendClick: caption=");
            sb.append(strK);
            sb.append(", fireTime=");
            l2 = l;
            sb.append(l2);
            a4cVar.c(je9Var2, str, sb.toString(), null);
        } else {
            l2 = l;
        }
        Object value = this.v.getValue();
        yy5 yy5Var = value instanceof yy5 ? (yy5) value : null;
        if (yy5Var == null) {
            String str2 = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onSendClick: called with no State.ResultPreview", null);
                return;
            }
            return;
        }
        if (yy5Var.b) {
            String str3 = this.d;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, str3, "onSendClick: is already sending", null);
                return;
            }
            return;
        }
        String path = yy5Var.a.getPath();
        if (path != null) {
            ((ae9) ((my5) this.o.getValue()).a.getValue()).h("sending_edited_media_from_fullview_click", s66.a);
            mjg mjgVar = this.v;
            yy5 yy5VarA = yy5.a(yy5Var, null, true, 5);
            mjgVar.getClass();
            mjgVar.j(null, yy5VarA);
            this.q.B(this, B[1], a8j.t(this, null, new gv7(this, charSequence, path, l2, yy5Var, null, 3), 1));
            return;
        }
        String str4 = this.d;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            Object obj = yy5Var.a;
            if (gm0.c()) {
                string = obj.toString();
            } else {
                if (obj instanceof Collection) {
                    Collection collection2 = (Collection) obj;
                    if (collection2.isEmpty()) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(collection2.size(), "[**", "**]");
                    }
                } else if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    strK2 = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
                } else if (obj instanceof Object[]) {
                    Object[] objArr2 = (Object[]) obj;
                    if (objArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(objArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr2 = (int[]) obj;
                    if (iArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(iArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr2 = (float[]) obj;
                    if (fArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(fArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr2 = (long[]) obj;
                    if (jArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(jArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(dArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr2 = (short[]) obj;
                    if (sArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(sArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    if (bArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(bArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr2 = (char[]) obj;
                    if (cArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(cArr2.length, "[**", "**]");
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr2 = (boolean[]) obj;
                    if (zArr2.length == 0) {
                        strK2 = "[]";
                    } else {
                        strK2 = c0a.k(zArr2.length, "[**", "**]");
                    }
                }
                string = strK2;
            }
            a4cVar4.c(je9Var, str4, qv1.k("onSendClick: path for uri is null ", string), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Uri uri) {
        String strK;
        String path = uri.getPath();
        lq4 lq4Var = null;
        if (path != null) {
            this.t.B(this, B[4], a8j.t(this, null, new jd3(this, uri, path, lq4Var, 26), 1));
            return;
        }
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            if (gm0.c()) {
                strK = uri.toString();
            } else if (uri instanceof Collection) {
                Collection collection = (Collection) uri;
                if (collection.isEmpty()) {
                    strK = "[]";
                } else {
                    strK = c0a.k(collection.size(), "[**", "**]");
                }
            } else if (uri instanceof Map) {
                Map map = (Map) uri;
                strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
            } else if (uri instanceof Object[]) {
                Object[] objArr = (Object[]) uri;
                if (objArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(objArr.length, "[**", "**]");
                }
            } else if (uri instanceof int[]) {
                int[] iArr = (int[]) uri;
                if (iArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(iArr.length, "[**", "**]");
                }
            } else if (uri instanceof float[]) {
                float[] fArr = (float[]) uri;
                if (fArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(fArr.length, "[**", "**]");
                }
            } else if (uri instanceof long[]) {
                long[] jArr = (long[]) uri;
                if (jArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(jArr.length, "[**", "**]");
                }
            } else if (uri instanceof double[]) {
                double[] dArr = (double[]) uri;
                if (dArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(dArr.length, "[**", "**]");
                }
            } else if (uri instanceof short[]) {
                short[] sArr = (short[]) uri;
                if (sArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(sArr.length, "[**", "**]");
                }
            } else if (uri instanceof byte[]) {
                byte[] bArr = (byte[]) uri;
                if (bArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(bArr.length, "[**", "**]");
                }
            } else if (uri instanceof char[]) {
                char[] cArr = (char[]) uri;
                if (cArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(cArr.length, "[**", "**]");
                }
            } else if (uri instanceof boolean[]) {
                boolean[] zArr = (boolean[]) uri;
                if (zArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(zArr.length, "[**", "**]");
                }
            } else {
                strK = "***";
            }
            a4cVar.c(je9Var, str, c0a.o("Can't open crop screen for uri=", strK, ": path is null"), null);
        }
    }

    public final void M(Uri uri) {
        sgg sggVarT = a8j.t(this, null, new bz5(this, uri, null, 1), 1);
        this.t.B(this, B[4], sggVarT);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(lq4 lq4Var) {
        hz5 hz5Var;
        if (lq4Var instanceof hz5) {
            hz5Var = (hz5) lq4Var;
            int i = hz5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz5Var.f = i - Integer.MIN_VALUE;
            } else {
                hz5Var = new hz5(this, (nq4) lq4Var);
            }
        } else {
            hz5Var = new hz5(this, (nq4) lq4Var);
        }
        Object objV = hz5Var.d;
        int i2 = hz5Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3VarH = H();
            long j = this.c.a;
            hz5Var.f = 1;
            objV = xn3VarH.v(j, hz5Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.j.getValue()));
    }
}
