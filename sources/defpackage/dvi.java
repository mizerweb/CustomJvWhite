package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dvi implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ y0e c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ dvi(String str, y0e y0eVar, float f, float f2, boolean z, int i) {
        this.a = i;
        this.b = str;
        this.c = y0eVar;
        this.d = f;
        this.e = f2;
        this.f = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        boolean z2 = this.f;
        float f = this.e;
        float f2 = this.d;
        y0e y0eVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("\n            DELETE FROM video_conversions \n            WHERE source_uri=? \n            AND quality=? \n            AND start_trim_position=? \n            AND end_trim_position=? \n            AND mute=?    \n        ");
                try {
                    if (str == null) {
                        vxeVarO0.e(1);
                    } else {
                        vxeVarO0.B(1, str);
                    }
                    vxeVarO0.c(2, y0eVar.b);
                    vxeVarO0.a(3, f2);
                    vxeVarO0.a(4, f);
                    vxeVarO0.c(5, z2 ? 1L : 0L);
                    vxeVarO0.M0();
                    vxeVarO0.close();
                    return sbi.a;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("\n            SELECT * FROM video_conversions \n            WHERE source_uri=? \n            AND quality=? \n            AND start_trim_position=? \n            AND end_trim_position=? \n            AND mute=?\n        ");
                try {
                    if (str == null) {
                        vxeVarO1.e(1);
                    } else {
                        vxeVarO1.B(1, str);
                    }
                    vxeVarO1.c(2, y0eVar.b);
                    vxeVarO1.a(3, f2);
                    vxeVarO1.a(4, f);
                    vxeVarO1.c(5, z2 ? 1L : 0L);
                    int iE = qyj.E(vxeVarO1, "finished");
                    int iE2 = qyj.E(vxeVarO1, "prepared_mime_type");
                    int iE3 = qyj.E(vxeVarO1, "prepared_path");
                    int iE4 = qyj.E(vxeVarO1, "result_path");
                    int iE5 = qyj.E(vxeVarO1, "source_uri");
                    int iE6 = qyj.E(vxeVarO1, "quality");
                    int iE7 = qyj.E(vxeVarO1, "start_trim_position");
                    int iE8 = qyj.E(vxeVarO1, "end_trim_position");
                    int iE9 = qyj.E(vxeVarO1, "mute");
                    yui yuiVar = null;
                    if (vxeVarO1.M0()) {
                        a70 a70Var = new a70();
                        a70Var.d = vxeVarO1.B0(iE5);
                        a70Var.a = k1m.e(vxeVarO1.isNull(iE6) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE6)));
                        a70Var.b = (float) vxeVarO1.getDouble(iE7);
                        a70Var.c = (float) vxeVarO1.getDouble(iE8);
                        a70Var.e = ((int) vxeVarO1.getLong(iE9)) != 0;
                        yui yuiVar2 = new yui();
                        if (((int) vxeVarO1.getLong(iE)) == 0) {
                            z = false;
                        }
                        yuiVar2.b = z;
                        if (vxeVarO1.isNull(iE2)) {
                            yuiVar2.c = null;
                        } else {
                            yuiVar2.c = vxeVarO1.B0(iE2);
                        }
                        if (vxeVarO1.isNull(iE3)) {
                            yuiVar2.d = null;
                        } else {
                            yuiVar2.d = vxeVarO1.B0(iE3);
                        }
                        if (vxeVarO1.isNull(iE4)) {
                            yuiVar2.e = null;
                        } else {
                            yuiVar2.e = vxeVarO1.B0(iE4);
                        }
                        yuiVar2.a = a70Var;
                        yuiVar = yuiVar2;
                    }
                    vxeVarO1.close();
                    return yuiVar;
                } catch (Throwable th2) {
                    vxeVarO1.close();
                    throw th2;
                }
        }
    }
}
