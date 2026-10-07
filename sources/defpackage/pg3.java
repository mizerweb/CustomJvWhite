package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pg3 {
    public final String a = pg3.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public pg3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    public static ynh b(yhh yhhVar) {
        dih dihVarA = svl.a(yhhVar);
        if (dihVarA.equals(zhh.a)) {
            return new tnh(R.string.oneme_profile_edit_admin_action_participants_permission_disable_copy_common_error);
        }
        if (dihVarA.equals(aih.a)) {
            return new tnh(R.string.common_network_error);
        }
        if (dihVarA.equals(bih.a)) {
            return new tnh(R.string.common_service_error);
        }
        if (dihVarA instanceof cih) {
            return new xnh(((cih) dihVarA).a);
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
    
        if (r1.w(r2, r6) == r5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b4, code lost:
    
        if (r4 == r5) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r32, boolean r34, java.lang.String r35, defpackage.nq4 r36) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg3.a(long, boolean, java.lang.String, nq4):java.lang.Object");
    }
}
