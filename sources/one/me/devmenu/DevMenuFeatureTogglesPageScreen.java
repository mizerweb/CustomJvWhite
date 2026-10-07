package one.me.devmenu;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.aw8;
import defpackage.az8;
import defpackage.br4;
import defpackage.bx3;
import defpackage.cqk;
import defpackage.ctf;
import defpackage.d0g;
import defpackage.d1b;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.ew5;
import defpackage.f55;
import defpackage.fsf;
import defpackage.ghb;
import defpackage.gm0;
import defpackage.gvd;
import defpackage.h;
import defpackage.ha9;
import defpackage.hri;
import defpackage.hve;
import defpackage.i5d;
import defpackage.iic;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jz4;
import defpackage.kj5;
import defpackage.ksf;
import defpackage.lv5;
import defpackage.lve;
import defpackage.lw5;
import defpackage.m2i;
import defpackage.mjg;
import defpackage.mu1;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.ny8;
import defpackage.p;
import defpackage.p77;
import defpackage.p90;
import defpackage.pq3;
import defpackage.qe7;
import defpackage.qh1;
import defpackage.qr3;
import defpackage.qr7;
import defpackage.qsf;
import defpackage.qy3;
import defpackage.r5h;
import defpackage.rsf;
import defpackage.rv8;
import defpackage.sw;
import defpackage.t7c;
import defpackage.uvc;
import defpackage.vz0;
import defpackage.w83;
import defpackage.wm9;
import defpackage.ww3;
import defpackage.xnh;
import defpackage.xr1;
import defpackage.xw3;
import defpackage.yab;
import defpackage.yhf;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw3;
import defpackage.zfe;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.devmenu.utils.FeatureValueInfoBottomSheet;
import one.me.devmenu.utils.IntValueBottomSheet;
import one.me.devmenu.utils.JsonBottomSheet;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.devmenu.utils.StringValueBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.sections.SectionRecyclerWidget;
import org.json.JSONArray;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/devmenu/DevMenuFeatureTogglesPageScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lqsf;", "Lhri;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevMenuFeatureTogglesPageScreen extends SectionRecyclerWidget implements qsf, hri {
    public static final /* synthetic */ zv8[] k;
    public final mu1 d;
    public LinkedHashMap e;
    public final h f;
    public final j8e g;
    public final rsf h;
    public final qh1 i;
    public final mjg j;

    static {
        dwd dwdVar = new dwd(DevMenuFeatureTogglesPageScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0);
        zfe.a.getClass();
        k = new zv8[]{dwdVar};
    }

    public DevMenuFeatureTogglesPageScreen(Bundle bundle) {
        super(bundle);
        this.d = new mu1(3, new lv5(23));
        this.e = new LinkedHashMap();
        this.f = new h(m35getAccountScopeuqN4xOY());
        this.g = viewBinding(R.id.oneme_devmenu_screen_toggles_search_view);
        ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
        this.h = new rsf(this, forkJoinPoolCommonPool);
        this.i = new qh1(forkJoinPoolCommonPool, 4);
        this.j = p90.a("");
    }

    @Override // defpackage.hri
    public final void I(long j, String str) {
        i5d i5dVar = (i5d) wm9.N0(this.e, Long.valueOf(j));
        rv8 rv8Var = i5dVar.h;
        ny8 ny8Var = i5dVar.i;
        if (cqk.d(rv8Var, zfe.a(Boolean.TYPE))) {
            i5dVar.j(Boolean.valueOf(r5h.w1(str)));
        } else if (cqk.d(rv8Var, zfe.a(Float.TYPE))) {
            i5dVar.j(Float.valueOf(Float.parseFloat(str)));
        } else if (cqk.d(rv8Var, zfe.a(Double.TYPE))) {
            i5dVar.j(Double.valueOf(Double.parseDouble(str)));
        } else if (cqk.d(rv8Var, zfe.a(Integer.TYPE))) {
            i5dVar.j(Integer.valueOf(Integer.parseInt(str)));
        } else if (cqk.d(rv8Var, zfe.a(Long.TYPE))) {
            i5dVar.j(Long.valueOf(Long.parseLong(str)));
        } else if (cqk.d(rv8Var, zfe.a(String.class))) {
            i5dVar.j(str);
        } else if (cqk.d(rv8Var, zfe.a(long[].class))) {
            List listL1 = r5h.l1(str, new char[]{','});
            ArrayList arrayList = new ArrayList(yw3.W0(listL1, 10));
            Iterator it = listL1.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
            }
            i5dVar.j(ww3.U1(arrayList));
        } else if (cqk.d(rv8Var, zfe.a(Set.class))) {
            List listL2 = r5h.l1(str, new char[]{','});
            ArraySet arraySet = new ArraySet();
            Iterator it2 = listL2.iterator();
            while (it2.hasNext()) {
                arraySet.add(r5h.y1((String) it2.next()).toString());
            }
            i5dVar.j(arraySet);
        } else if (cqk.d(rv8Var, zfe.a(List.class))) {
            if (((aw8) ny8Var.getValue()) != null) {
                i5dVar.j(i5dVar.b(str));
            } else {
                i5dVar.j(f55.F(new JSONArray(str)));
            }
        } else if (cqk.d(rv8Var, zfe.a(ew5.class))) {
            ghb ghbVar = ew5.b;
            i5dVar.j(new ew5(qe7.P(Long.parseLong(str), lw5.MILLISECONDS)));
        } else if (jz4.class.isAssignableFrom(((qr3) rv8Var).d())) {
            if (!gvd.class.isAssignableFrom(((qr3) rv8Var).d())) {
                qr7.v(rv8Var, "Unsupported value type: ");
                return;
            }
            i5dVar.j(new gvd(Float.parseFloat(str)));
        } else {
            if (((aw8) ny8Var.getValue()) == null) {
                qr7.v(rv8Var, "Unsupported value type: ");
                return;
            }
            i5dVar.j(i5dVar.b(str));
        }
        t1();
    }

    @Override // defpackage.qsf
    public final boolean U(long j) {
        DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = this;
        i5d i5dVar = (i5d) wm9.N0(devMenuFeatureTogglesPageScreen.e, Long.valueOf(j));
        zv8[] zv8VarArr = BottomSheetWidget.t;
        CharSequence charSequence = (CharSequence) i5dVar.f.getValue();
        if (charSequence.length() == 0) {
            charSequence = i5dVar.a;
        }
        String string = charSequence.toString();
        String strD = i5dVar.d(i5dVar.i());
        if (strD == null) {
            strD = "null";
        }
        FeatureValueInfoBottomSheet featureValueInfoBottomSheet = new FeatureValueInfoBottomSheet(n1g.i(new ylc("arg:toggle_id", Long.valueOf(j)), new ylc("arg:title", string), new ylc("arg:default_value", i5dVar.d(i5dVar.b)), new ylc("arg:current_value", strD), new ylc("arg:value_source", iic.n(i5dVar.o)), new ylc("arg:local_value", i5dVar.d(d0g.c(i5dVar.g(), i5dVar.a, null, i5dVar.h, i5dVar.f(), i5dVar.i))), new ylc("arg:server_value", i5dVar.d(d0g.c((SharedPreferences) i5dVar.m.getValue(), i5dVar.a, null, i5dVar.h, i5dVar.f(), i5dVar.i))), new ylc("arg:experiment_value", i5dVar.d(d0g.c((SharedPreferences) i5dVar.l.getValue(), i5dVar.a, null, i5dVar.h, i5dVar.f(), i5dVar.i)))));
        featureValueInfoBottomSheet.setTargetController(devMenuFeatureTogglesPageScreen);
        br4 parentController = devMenuFeatureTogglesPageScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(featureValueInfoBottomSheet, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
        return true;
    }

    @Override // defpackage.qsf
    public final void c(long j) {
        hve hveVarU1;
        DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = this;
        i5d i5dVar = (i5d) wm9.N0(devMenuFeatureTogglesPageScreen.e, Long.valueOf(j));
        if (cqk.d(i5dVar.h, zfe.a(Boolean.TYPE))) {
            i5dVar.j(Boolean.valueOf(!((Boolean) i5dVar.i()).booleanValue()));
            return;
        }
        if (cqk.d(i5dVar.h, zfe.a(Integer.TYPE))) {
            zv8[] zv8VarArr = BottomSheetWidget.t;
            IntValueBottomSheet intValueBottomSheet = new IntValueBottomSheet(((Number) i5dVar.i()).intValue(), j, (String[]) i5dVar.g.getValue());
            intValueBottomSheet.setTargetController(devMenuFeatureTogglesPageScreen);
            br4 parentController = devMenuFeatureTogglesPageScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(intValueBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
                return;
            }
            return;
        }
        if (cqk.d(i5dVar.h, zfe.a(Long.TYPE))) {
            zv8[] zv8VarArr2 = BottomSheetWidget.t;
            LongValueBottomSheet longValueBottomSheet = new LongValueBottomSheet(((Number) i5dVar.i()).longValue(), j, (String[]) i5dVar.g.getValue());
            longValueBottomSheet.setTargetController(devMenuFeatureTogglesPageScreen);
            br4 parentController2 = devMenuFeatureTogglesPageScreen;
            while (parentController2.getParentController() != null) {
                parentController2 = parentController2.getParentController();
            }
            RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
            hveVarU1 = rootController2 != null ? rootController2.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar2 = new lve(longValueBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar2, true, "BottomSheetWidget");
                hveVarU1.I(lveVar2);
                return;
            }
            return;
        }
        if (cqk.d(i5dVar.h, zfe.a(String.class))) {
            String str = (String) i5dVar.i();
            zv8[] zv8VarArr3 = BottomSheetWidget.t;
            StringValueBottomSheet stringValueBottomSheet = new StringValueBottomSheet(str != null ? str : "null", j, (String[]) i5dVar.g.getValue());
            stringValueBottomSheet.setTargetController(devMenuFeatureTogglesPageScreen);
            br4 parentController3 = devMenuFeatureTogglesPageScreen;
            while (parentController3.getParentController() != null) {
                parentController3 = parentController3.getParentController();
            }
            RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
            hveVarU1 = rootController3 != null ? rootController3.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar3 = new lve(stringValueBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar3, true, "BottomSheetWidget");
                hveVarU1.I(lveVar3);
                return;
            }
            return;
        }
        if (cqk.d(i5dVar.h, zfe.a(Map.class)) || i5dVar.i.getValue() != null) {
            zv8[] zv8VarArr4 = BottomSheetWidget.t;
            JsonBottomSheet jsonBottomSheet = new JsonBottomSheet(j, i5dVar.a, devMenuFeatureTogglesPageScreen.getB().b());
            jsonBottomSheet.setTargetController(devMenuFeatureTogglesPageScreen);
            br4 parentController4 = devMenuFeatureTogglesPageScreen;
            while (parentController4.getParentController() != null) {
                parentController4 = parentController4.getParentController();
            }
            RootController rootController4 = parentController4 instanceof RootController ? (RootController) parentController4 : null;
            hveVarU1 = rootController4 != null ? rootController4.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar4 = new lve(jsonBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar4, true, "BottomSheetWidget");
                hveVarU1.I(lveVar4);
                return;
            }
            return;
        }
        if (cqk.d(i5dVar.h, zfe.a(Set.class))) {
            Set set = (Set) i5dVar.i();
            zv8[] zv8VarArr5 = BottomSheetWidget.t;
            String strZ1 = set != null ? ww3.z1(set, ",", null, null, null, 62) : null;
            if (strZ1 == null) {
                strZ1 = "";
            }
            StringValueBottomSheet stringValueBottomSheet2 = new StringValueBottomSheet(strZ1, j, (String[]) i5dVar.g.getValue());
            stringValueBottomSheet2.setTargetController(devMenuFeatureTogglesPageScreen);
            br4 parentController5 = devMenuFeatureTogglesPageScreen;
            while (parentController5.getParentController() != null) {
                parentController5 = parentController5.getParentController();
            }
            RootController rootController5 = parentController5 instanceof RootController ? (RootController) parentController5 : null;
            hveVarU1 = rootController5 != null ? rootController5.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar5 = new lve(stringValueBottomSheet2, null, null, null, false, -1);
                p.k(false, lveVar5, true, "BottomSheetWidget");
                hveVarU1.I(lveVar5);
                return;
            }
            return;
        }
        if (cqk.d(i5dVar.h, zfe.a(List.class))) {
            zv8[] zv8VarArr6 = BottomSheetWidget.t;
            String strD = i5dVar.d(i5dVar.i());
            StringValueBottomSheet stringValueBottomSheet3 = new StringValueBottomSheet(strD != null ? strD : "null", j, (String[]) i5dVar.g.getValue());
            stringValueBottomSheet3.setTargetController(devMenuFeatureTogglesPageScreen);
            br4 parentController6 = devMenuFeatureTogglesPageScreen;
            while (parentController6.getParentController() != null) {
                parentController6 = parentController6.getParentController();
            }
            RootController rootController6 = parentController6 instanceof RootController ? (RootController) parentController6 : null;
            hveVarU1 = rootController6 != null ? rootController6.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar6 = new lve(stringValueBottomSheet3, null, null, null, false, -1);
                p.k(false, lveVar6, true, "BottomSheetWidget");
                hveVarU1.I(lveVar6);
                return;
            }
            return;
        }
        String name = DevMenuFeatureTogglesPageScreen.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "unknown type " + i5dVar.a + " " + i5dVar.h, null);
        }
    }

    @Override // defpackage.qsf
    public final void l(long j, boolean z) {
        ((i5d) wm9.N0(this.e, Long.valueOf(j))).j(Boolean.valueOf(z));
        t1();
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* JADX INFO: renamed from: o1, reason: from getter */
    public final qh1 getE() {
        return this.i;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        t7c t7cVar = new t7c(layoutInflater.getContext());
        t7cVar.setId(R.id.oneme_devmenu_screen_toggles_search_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, gm0.K(0.0f * yl5.d().getDisplayMetrics().density), iK, iK2);
        t7cVar.setLayoutParams(layoutParams);
        t7cVar.setShouldShowBackButton(false);
        t7cVar.setExpandable(true);
        t7cVar.setCollapsible(false);
        t7cVar.c(false);
        t7cVar.setShouldShowSearchIcon(false);
        t7cVar.setSearchHint("Поиск");
        t7cVar.setListener(new uvc(this, 14, t7cVar));
        linearLayout.addView(t7cVar);
        linearLayout.addView(r1(16));
        n1g.N(new xr1(3, null, 1), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        nl9.c((t7c) this.g.m(this, k[0]));
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e5d e5dVar = (e5d) this.f.getAccessor().d(26).getValue();
        e5dVar.getClass();
        m2i m2iVarT0 = yhf.t0(yhf.m0(new sw(1, new ArrayList(e5dVar.o().values())), new w83(23)), kj5.h);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<i5d> arrayList = new ArrayList();
        yhf.v0(m2iVarT0, arrayList);
        bx3.Y0(arrayList, this.d);
        for (i5d i5dVar : arrayList) {
            linkedHashMap.put(Long.valueOf(i5dVar.a.hashCode()), i5dVar);
        }
        this.e = linkedHashMap;
        t1();
        yab.i0(getViewLifecycleScope(), null, 0, new qy3(this, null, 10), 3);
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final rsf getD() {
        return this.h;
    }

    public final ArrayList s1(String str) {
        Collection collectionValues;
        String str2;
        if (r5h.X0(str)) {
            collectionValues = this.e.values();
        } else {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Collection collectionValues2 = this.e.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues2) {
                i5d i5dVar = (i5d) obj;
                List listM1 = r5h.m1(lowerCase, new String[]{" "}, 6);
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj2 : listM1) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    for (String str3 : arrayList2) {
                        if (!r5h.L0((CharSequence) i5dVar.f.getValue(), str3, true) && !r5h.L0(a.h1((Object[]) i5dVar.g.getValue(), null, null, null, null, 63), str3, true) && !r5h.L0(i5dVar.a, str3, true)) {
                            Object obj3 = i5dVar.b;
                            if ((obj3 instanceof Boolean) || !r5h.L0(i5dVar.d(obj3), str3, true)) {
                            }
                        }
                        arrayList.add(obj);
                    }
                }
            }
            collectionValues = arrayList;
        }
        Collection<i5d> collection = collectionValues;
        char c = '\n';
        ArrayList arrayList3 = new ArrayList(yw3.W0(collection, 10));
        for (i5d i5dVar2 : collection) {
            CharSequence charSequence = (CharSequence) i5dVar2.f.getValue();
            if (charSequence.length() == 0) {
                charSequence = i5dVar2.a;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!cqk.d(charSequence, i5dVar2.a)) {
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) i5dVar2.a);
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append(c);
            }
            ArrayList arrayListR0 = xw3.R0(new vz0());
            if (i5dVar2.o == 2) {
                arrayListR0.add(new p77(pq3.j.e(getContext()).m().getText().h));
            }
            Object[] array = arrayListR0.toArray(new Object[0]);
            Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) iic.n(i5dVar2.o)).append(':');
            for (Object obj4 : objArrCopyOf) {
                spannableStringBuilder.setSpan(obj4, length2, spannableStringBuilder.length(), 17);
            }
            Object[] objArr = {new d1b(), new RelativeSizeSpan(0.8f)};
            int length3 = spannableStringBuilder.length();
            String strD = i5dVar2.d(i5dVar2.i());
            if (strD == null) {
                strD = "null";
            }
            spannableStringBuilder.append((CharSequence) strD);
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length3, spannableStringBuilder.length(), 17);
            }
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            long jHashCode = i5dVar2.a.hashCode();
            xnh xnhVar = new xnh(charSequence);
            xnh xnhVar2 = new xnh(spannedString);
            switch (i5dVar2.c) {
                case 1:
                    str2 = "🀆";
                    break;
                case 2:
                    str2 = "📞";
                    break;
                case 3:
                    str2 = "💾";
                    break;
                case 4:
                    str2 = "🔀";
                    break;
                case 5:
                    str2 = "🎨";
                    break;
                case 6:
                    str2 = "🔔";
                    break;
                case 7:
                    str2 = "👀";
                    break;
                case 8:
                    str2 = "📊";
                    break;
                case 9:
                    str2 = "🎖️";
                    break;
                case 10:
                    str2 = "🧦";
                    break;
                default:
                    throw null;
            }
            arrayList3.add(new ctf(jHashCode, 0, xnhVar, null, null, null, new az8(str2), cqk.d(i5dVar2.h, zfe.a(Boolean.TYPE)) ? new ksf(((Boolean) i5dVar2.i()).booleanValue(), true) : fsf.a, null, false, xnhVar2, 824));
            c = '\n';
        }
        return arrayList3;
    }

    public final void t1() {
        this.h.H(s1((String) this.j.getValue()));
    }

    public DevMenuFeatureTogglesPageScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
