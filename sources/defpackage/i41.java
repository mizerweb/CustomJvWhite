package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.folders.list.FoldersListScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i41 extends fg7 implements tf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(p41 p41Var, int i) {
        super(3, 0, p41.class, p41Var, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
        this.a = i;
        switch (i) {
            case 1:
                super(3, 0, p41.class, p41Var, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
        Collection collectionJ;
        String str;
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                fel.a(((p41) this.receiver).b, obj2, (vt4) obj3);
                return sbiVar;
            case 1:
                Object obj4 = ((ds2) obj2).a;
                fel.a(((p41) this.receiver).b, obj4 instanceof cs2 ? null : obj4, (vt4) obj3);
                return sbiVar;
            case 2:
                zmi zmiVar = (zmi) obj2;
                ((Number) obj3).intValue();
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
                zv8[] zv8VarArr = FoldersListScreen.h;
                foldersListScreen.o1().n = zmiVar;
                pp4 pp4VarF = opl.b(foldersListScreen, 1).f((View) obj);
                foldersListScreen.o1().getClass();
                r17 r17Var = zmiVar.a;
                if (r17Var == null) {
                    collectionJ = r66.a;
                } else {
                    c79 c79VarW = yab.w();
                    c79VarW.add(new rp4(R.id.oneme_folders_list_menu_action_change, new tnh(R.string.oneme_folders_list_menu_action_change), Integer.valueOf(R.drawable.icon_edit), (Integer) null, 20));
                    if (!r17Var.i.contains(s37.NO_DELETE)) {
                        c79VarW.add(new rp4(R.id.oneme_folders_list_menu_action_delete_folder, new tnh(R.string.oneme_folders_list_menu_action_delete_folder), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative)));
                    }
                    collectionJ = yab.j(c79VarW);
                }
                pp4VarF.l(collectionJ).b().build().u(foldersListScreen);
                return sbiVar;
            default:
                pba pbaVar = (pba) obj;
                long jLongValue = ((Number) obj2).longValue();
                ru ruVar = (ru) obj3;
                nba nbaVar = pbaVar.c;
                ((zaa) this.receiver).getClass();
                long j = pbaVar.a;
                long j2 = j - jLongValue;
                if (j2 < 0) {
                    j2 = 0;
                }
                int iOrdinal = ruVar.a(j).ordinal();
                if (iOrdinal == 0) {
                    str = "fg";
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    str = "bg";
                }
                du8 du8Var = new du8();
                l51.c(du8Var, "reason", Integer.valueOf(pbaVar.b.a));
                l51.c(du8Var, "ts", Long.valueOf(j2));
                l51.d(du8Var, "vis", str);
                l51.c(du8Var, "pss_java", Long.valueOf(nbaVar.a));
                l51.c(du8Var, "pss_native", Long.valueOf(nbaVar.b));
                l51.c(du8Var, "pss_code", Long.valueOf(nbaVar.c));
                l51.c(du8Var, "pss_stack", Long.valueOf(nbaVar.d));
                l51.c(du8Var, "pss_graphics", Long.valueOf(nbaVar.e));
                l51.c(du8Var, "pss_other", Long.valueOf(nbaVar.f));
                l51.c(du8Var, "pss_system", Long.valueOf(nbaVar.g));
                l51.c(du8Var, "pss_swap", Long.valueOf(nbaVar.h));
                l51.c(du8Var, "pss_total", Long.valueOf(nbaVar.i));
                l51.c(du8Var, "rss", Integer.valueOf(pbaVar.g));
                l51.c(du8Var, "shared", Integer.valueOf(pbaVar.h));
                l51.c(du8Var, "trim", Integer.valueOf(pbaVar.d));
                du8Var.b(kt8.a(Boolean.valueOf(pbaVar.e)), "low");
                l51.c(du8Var, "available", Integer.valueOf(pbaVar.f));
                l51.c(du8Var, "importance", Integer.valueOf(pbaVar.k));
                l51.c(du8Var, "processes", Long.valueOf(pbaVar.j));
                l51.c(du8Var, "native_alloc", Integer.valueOf(pbaVar.l));
                ArrayList arrayList = new ArrayList();
                List list = pbaVar.i;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(kt8.c((String) it.next()));
                }
                arrayList.addAll(arrayList2);
                du8Var.b(new ss8(arrayList), "backstack");
                return du8Var.a().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i41(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
        this.a = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(Object obj) {
        super(3, 0, zaa.class, obj, "encodeWinner", "encodeWinner(Lone/me/statistics/androidperf/memory/MemorySnapshot;JLone/me/statistics/androidperf/visibility/AppVisibilityResolver;)Ljava/lang/String;");
        this.a = 3;
    }
}
