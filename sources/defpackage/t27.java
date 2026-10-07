package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import one.me.folders.edit.FolderEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class t27 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ FolderEditScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t27(FolderEditScreen folderEditScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = folderEditScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        FolderEditScreen folderEditScreen = this.g;
        switch (i) {
            case 0:
                t27 t27Var = new t27(folderEditScreen, lq4Var, 0);
                t27Var.f = obj;
                return t27Var;
            default:
                t27 t27Var2 = new t27(folderEditScreen, lq4Var, 1);
                t27Var2.f = obj;
                return t27Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((t27) create((n27) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((t27) create((w27) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ia8 ia8Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        FolderEditScreen folderEditScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                n27 n27Var = (n27) obj2;
                ch3.d0(obj);
                if (n27Var instanceof k27) {
                    zv8[] zv8VarArr = FolderEditScreen.i;
                    folderEditScreen.q1();
                    folderEditScreen.getRouter().D();
                    if (!((k27) n27Var).a || (ia8Var = (ia8) folderEditScreen.d.getAccessor().f()) == null) {
                        return sbiVar;
                    }
                    ia8Var.f(Collections.singleton(new ha8(fa8.CREATE_FOLDER, 1)), y3f.SETTINGS_FOLDERS);
                    return sbiVar;
                }
                if (!(n27Var instanceof m27)) {
                    if (!(n27Var instanceof l27)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr2 = FolderEditScreen.i;
                    url.c(String.valueOf(((w27) folderEditScreen.p1().o.a.getValue()).a()), folderEditScreen);
                    return sbiVar;
                }
                String str = ((lve) ww3.B1(folderEditScreen.getRouter().e())).b;
                if (str == null) {
                    return sbiVar;
                }
                folderEditScreen.q1();
                r37 r37Var = r37.b;
                m27 m27Var = (m27) n27Var;
                boolean z = m27Var.b;
                ArrayList arrayList = m27Var.a;
                o65 o65VarB = r37Var.b();
                String strZ1 = ww3.z1(arrayList, ",", null, null, null, 62);
                StringBuilder sbA = zo5.A(":settings/folder/members-picker?tag=", str, "&filters_enabled=", "&members_ids=", z);
                sbA.append(strZ1);
                o65.c(o65VarB, sbA.toString(), null, null, 6);
                return sbiVar;
            default:
                w27 w27Var = (w27) obj2;
                ch3.d0(obj);
                if (w27Var instanceof u27) {
                    FolderEditScreen.o1(folderEditScreen, ((u27) w27Var).b);
                    return sbiVar;
                }
                if (w27Var instanceof v27) {
                    FolderEditScreen.o1(folderEditScreen, ((v27) w27Var).c);
                    return sbiVar;
                }
                ore.o();
                return null;
        }
    }
}
