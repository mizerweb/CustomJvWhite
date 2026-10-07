package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qwg {
    public final rre a;
    public final pl b = new pl(19, this);
    public final pl c = new pl(20);
    public final pl d = new pl(21);
    public final pl e = new pl(22);
    public final pl f = new pl(23, this);
    public final pl g = new pl(24);

    public qwg(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(qwg qwgVar, long j, nq4 nq4Var) {
        lwg lwgVar;
        if (nq4Var instanceof lwg) {
            lwgVar = (lwg) nq4Var;
            int i = lwgVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwgVar.i = i - Integer.MIN_VALUE;
            } else {
                lwgVar = new lwg(qwgVar, nq4Var);
            }
        } else {
            lwgVar = new lwg(qwgVar, nq4Var);
        }
        Object objI = lwgVar.g;
        int i2 = lwgVar.i;
        int i3 = 2;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            lwgVar.d = qwgVar;
            lwgVar.f = j;
            lwgVar.i = 1;
            objI = ch3.I(lwgVar, qwgVar.a, true, false, new uy6(j, qwgVar, i3));
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = lwgVar.e;
            ch3.d0(objI);
            return list;
        }
        j = lwgVar.f;
        qwgVar = lwgVar.d;
        ch3.d0(objI);
        List list2 = (List) objI;
        lwgVar.d = null;
        lwgVar.e = list2;
        lwgVar.f = j;
        lwgVar.i = 2;
        return ch3.I(lwgVar, qwgVar.a, false, true, new uy6(j, 3)) == hu4Var ? hu4Var : list2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103 A[PHI: r1 r10 r12
  0x0103: PHI (r1v8 qwg) = (r1v5 qwg), (r1v9 qwg) binds: [B:32:0x00dc, B:36:0x00fa] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r10v8 long) = (r10v5 long), (r10v9 long) binds: [B:32:0x00dc, B:36:0x00fa] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r12v8 hxg) = (r12v5 hxg), (r12v9 hxg) binds: [B:32:0x00dc, B:36:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123 A[PHI: r1 r10 r12
  0x0123: PHI (r1v11 qwg) = (r1v8 qwg), (r1v12 qwg) binds: [B:41:0x011f, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r10v11 long) = (r10v8 long), (r10v12 long) binds: [B:41:0x011f, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r12v11 hxg) = (r12v8 hxg), (r12v12 hxg) binds: [B:41:0x011f, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141 A[PHI: r1 r10 r12
  0x0141: PHI (r1v13 qwg) = (r1v11 qwg), (r1v14 qwg) binds: [B:46:0x013e, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x0141: PHI (r10v13 long) = (r10v11 long), (r10v14 long) binds: [B:46:0x013e, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x0141: PHI (r12v13 hxg) = (r12v11 hxg), (r12v14 hxg) binds: [B:46:0x013e, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168 A[PHI: r1 r10 r12
  0x0168: PHI (r1v15 qwg) = (r1v13 qwg), (r1v13 qwg), (r1v16 qwg) binds: [B:49:0x0149, B:51:0x0165, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0168: PHI (r10v15 long) = (r10v13 long), (r10v13 long), (r10v16 long) binds: [B:49:0x0149, B:51:0x0165, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0168: PHI (r12v15 hxg) = (r12v13 hxg), (r12v13 hxg), (r12v16 hxg) binds: [B:49:0x0149, B:51:0x0165, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x018f A[PHI: r1 r10 r12
  0x018f: PHI (r1v17 qwg) = (r1v15 qwg), (r1v15 qwg), (r1v18 qwg) binds: [B:54:0x0170, B:56:0x018c, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r10v17 long) = (r10v15 long), (r10v15 long), (r10v18 long) binds: [B:54:0x0170, B:56:0x018c, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r12v17 hxg) = (r12v15 hxg), (r12v15 hxg), (r12v19 hxg) binds: [B:54:0x0170, B:56:0x018c, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        if (r13 == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ae, code lost:
    
        if (r13 == r6) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(defpackage.qwg r10, defpackage.swg r11, defpackage.ptf r12, defpackage.nq4 r13) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwg.g(qwg, swg, ptf, nq4):java.lang.Object");
    }

    public final void a(qxe qxeVar, vi9 vi9Var) {
        if (vi9Var.d()) {
            return;
        }
        int i = 2;
        int i2 = 1;
        if (vi9Var.i() > 999) {
            snl.c(vi9Var, true, new owg(this, qxeVar, 2));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `draft_id`,`layer_id`,`position`,`color`,`width`,`primitives`,`bounds_left`,`bounds_top`,`bounds_right`,`bounds_bottom` FROM `story_draft_drawing_layers` WHERE `draft_id` IN (");
        vd7.b(sbC, vi9Var.i());
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        int i3 = vi9Var.i();
        int i4 = 0;
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            vxeVarO0.c(i5, vi9Var.e(i6));
            i5++;
        }
        try {
            int iN = qyj.n(vxeVarO0, "draft_id");
            if (iN == -1) {
                vxeVarO0.close();
                return;
            }
            while (vxeVarO0.M0()) {
                List list = (List) vi9Var.b(vxeVarO0.getLong(iN));
                if (list != null) {
                    list.add(new rwg(vxeVarO0.getLong(i4), vxeVarO0.getLong(i2), (int) vxeVarO0.getLong(i), (int) vxeVarO0.getLong(3), (float) vxeVarO0.getDouble(4), msl.a(vxeVarO0.getBlob(5)), (int) vxeVarO0.getLong(6), (int) vxeVarO0.getLong(7), (int) vxeVarO0.getLong(8), (int) vxeVarO0.getLong(9)));
                    i4 = 0;
                    i = 2;
                    i2 = 1;
                }
            }
            vxeVarO0.close();
        } catch (Throwable th) {
            vxeVarO0.close();
            throw th;
        }
    }

    public final void b(qxe qxeVar, vi9 vi9Var) {
        if (vi9Var.d()) {
            return;
        }
        int i = 4;
        if (vi9Var.i() > 999) {
            snl.c(vi9Var, false, new owg(this, qxeVar, 4));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `draft_id`,`translation_x`,`translation_y`,`scale`,`rotation`,`pivot_x`,`pivot_y` FROM `story_draft_media_transform` WHERE `draft_id` IN (");
        vd7.b(sbC, vi9Var.i());
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        int i2 = vi9Var.i();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            vxeVarO0.c(i4, vi9Var.e(i5));
            i4++;
        }
        try {
            int iN = qyj.n(vxeVarO0, "draft_id");
            if (iN == -1) {
                vxeVarO0.close();
                return;
            }
            while (vxeVarO0.M0()) {
                long j = vxeVarO0.getLong(iN);
                if ((vi9Var.c(j) >= 0 ? i3 : 0) != 0) {
                    vi9Var.f(j, new xwg(vxeVarO0.getLong(0), (float) vxeVarO0.getDouble(i3), (float) vxeVarO0.getDouble(2), (float) vxeVarO0.getDouble(3), (float) vxeVarO0.getDouble(i), (float) vxeVarO0.getDouble(5), (float) vxeVarO0.getDouble(6)));
                    i3 = 1;
                    i = 4;
                }
            }
            vxeVarO0.close();
        } catch (Throwable th) {
            vxeVarO0.close();
            throw th;
        }
    }

    public final void c(qxe qxeVar, vi9 vi9Var) {
        if (vi9Var.d()) {
            return;
        }
        if (vi9Var.i() > 999) {
            snl.c(vi9Var, false, new owg(this, qxeVar, 0));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `draft_id`,`background_id` FROM `story_draft_text_attrs` WHERE `draft_id` IN (");
        vd7.b(sbC, vi9Var.i());
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        int i = vi9Var.i();
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            vxeVarO0.c(i2, vi9Var.e(i3));
            i2++;
        }
        try {
            int iN = qyj.n(vxeVarO0, "draft_id");
            if (iN == -1) {
                vxeVarO0.close();
                return;
            }
            while (vxeVarO0.M0()) {
                long j = vxeVarO0.getLong(iN);
                if (vi9Var.c(j) >= 0) {
                    vi9Var.f(j, new ixg(vxeVarO0.getLong(0), vxeVarO0.B0(1)));
                }
            }
            vxeVarO0.close();
        } catch (Throwable th) {
            vxeVarO0.close();
            throw th;
        }
    }

    public final void d(qxe qxeVar, vi9 vi9Var) {
        vi9Var = vi9Var;
        if (vi9Var.d()) {
            return;
        }
        int i = 1;
        if (vi9Var.i() > 999) {
            snl.c(vi9Var, true, new owg(this, qxeVar, 1));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `layer_id`,`draft_id`,`position`,`align_mode`,`text_color`,`text_background_color`,`text`,`text_style`,`layout_width`,`translation_x`,`translation_y`,`scale`,`rotation`,`text_bounds_left`,`text_bounds_top`,`text_bounds_right`,`text_bounds_bottom` FROM `story_draft_text_layers` WHERE `draft_id` IN (");
        vd7.b(sbC, vi9Var.i());
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        int i2 = vi9Var.i();
        int i3 = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            vxeVarO0.c(i4, vi9Var.e(i5));
            i4++;
        }
        try {
            int iN = qyj.n(vxeVarO0, "draft_id");
            if (iN == -1) {
                return;
            }
            while (vxeVarO0.M0()) {
                List list = (List) vi9Var.b(vxeVarO0.getLong(iN));
                if (list != null) {
                    int i6 = iN;
                    list.add(new jxg(vxeVarO0.getLong(i3), vxeVarO0.getLong(i), (int) vxeVarO0.getLong(2), vxeVarO0.B0(3), (int) vxeVarO0.getLong(4), (int) vxeVarO0.getLong(5), vxeVarO0.B0(6), vxeVarO0.B0(7), (int) vxeVarO0.getLong(8), (float) vxeVarO0.getDouble(9), (float) vxeVarO0.getDouble(10), (float) vxeVarO0.getDouble(11), (float) vxeVarO0.getDouble(12), vxeVarO0.isNull(13) ? null : Float.valueOf((float) vxeVarO0.getDouble(13)), vxeVarO0.isNull(14) ? null : Float.valueOf((float) vxeVarO0.getDouble(14)), vxeVarO0.isNull(15) ? null : Float.valueOf((float) vxeVarO0.getDouble(15)), vxeVarO0.isNull(16) ? null : Float.valueOf((float) vxeVarO0.getDouble(16))));
                    iN = i6;
                    i3 = 0;
                    i = 1;
                }
            }
        } finally {
            vxeVarO0.close();
        }
    }

    public final void e(qxe qxeVar, vi9 vi9Var) {
        if (vi9Var.d()) {
            return;
        }
        if (vi9Var.i() > 999) {
            snl.c(vi9Var, false, new owg(this, qxeVar, 3));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `draft_id`,`duration_ms`,`is_muted`,`trim_start_fraction`,`trim_end_fraction` FROM `story_draft_video_attrs` WHERE `draft_id` IN (");
        vd7.b(sbC, vi9Var.i());
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        int i = vi9Var.i();
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            vxeVarO0.c(i2, vi9Var.e(i3));
            i2++;
        }
        try {
            int iN = qyj.n(vxeVarO0, "draft_id");
            if (iN == -1) {
                vxeVarO0.close();
                return;
            }
            while (vxeVarO0.M0()) {
                long j = vxeVarO0.getLong(iN);
                if (vi9Var.c(j) >= 0) {
                    vi9Var.f(j, new lxg(vxeVarO0.getLong(0), vxeVarO0.getLong(1), ((int) vxeVarO0.getLong(2)) != 0, (float) vxeVarO0.getDouble(3), (float) vxeVarO0.getDouble(4)));
                }
            }
            vxeVarO0.close();
        } catch (Throwable th) {
            vxeVarO0.close();
            throw th;
        }
    }
}
