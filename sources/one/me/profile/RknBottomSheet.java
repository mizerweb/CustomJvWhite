package one.me.profile;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.af7;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.p;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.rx8;
import defpackage.vqa;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.profile.RknBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/profile/RknBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RknBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] y = {new dwd(RknBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), zo5.f(zfe.a, RknBottomSheet.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)};
    public final j8e u;
    public final j8e v;
    public final ny8 w;
    public final ny8 x;

    public RknBottomSheet() {
        super(new Bundle());
        this.u = viewBinding(R.id.rkn_bottom_sheet_title);
        this.v = viewBinding(R.id.rkn_bottom_sheet_subtitle);
        final int i = 0;
        this.w = rx8.P(3, new af7(this) { // from class: qqe
            public final /* synthetic */ RknBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                RknBottomSheet rknBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = RknBottomSheet.y;
                        return rknBottomSheet.getContext().getDrawable(R.drawable.icon_a_plus);
                    default:
                        zv8[] zv8VarArr2 = RknBottomSheet.y;
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        int[] iArr = ((pac) pq3.j.e(rknBottomSheet.getContext()).m().x().f).a;
                        ArrayList arrayList = new ArrayList(2);
                        for (int i3 = 0; i3 < 2; i3++) {
                            arrayList.add(Integer.valueOf(lvb.I0(iArr[i3], 0.16f)));
                        }
                        GradientDrawable gradientDrawable = new GradientDrawable(orientation, ww3.S1(arrayList));
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 24.0f);
                        return gradientDrawable;
                }
            }
        });
        final int i2 = 1;
        this.x = rx8.P(3, new af7(this) { // from class: qqe
            public final /* synthetic */ RknBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                RknBottomSheet rknBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = RknBottomSheet.y;
                        return rknBottomSheet.getContext().getDrawable(R.drawable.icon_a_plus);
                    default:
                        zv8[] zv8VarArr2 = RknBottomSheet.y;
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        int[] iArr = ((pac) pq3.j.e(rknBottomSheet.getContext()).m().x().f).a;
                        ArrayList arrayList = new ArrayList(2);
                        for (int i4 = 0; i4 < 2; i4++) {
                            arrayList.add(Integer.valueOf(lvb.I0(iArr[i4], 0.16f)));
                        }
                        GradientDrawable gradientDrawable = new GradientDrawable(orientation, ww3.S1(arrayList));
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 24.0f);
                        return gradientDrawable;
                }
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 72.0f), gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 0);
        imageView.setLayoutParams(layoutParams);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        imageView.setPadding(iK, iK, iK, iK);
        linearLayout.setGravity(17);
        ny8 ny8Var = this.w;
        imageView.setImageDrawable((Drawable) ny8Var.getValue());
        imageView.setBackground((GradientDrawable) this.x.getValue());
        Drawable drawable = (Drawable) ny8Var.getValue();
        a8g a8gVar = pq3.j;
        drawable.setTint(a8gVar.h(imageView).x().b);
        linearLayout.addView(imageView);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.rkn_bottom_sheet_title);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText(R.string.rkn_bottom_sheet_title);
        textView.setTextColor(p.d(textView, q9i.c, a8gVar, textView).b);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.rkn_bottom_sheet_subtitle);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(R.string.rkn_bottom_sheet_subtitle);
        textView2.setTextColor(p.d(textView2, q9i.i, a8gVar, textView2).d);
        linearLayout.addView(textView2);
        cyb cybVar = new cyb(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams4);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.its_clear));
        qe7.H(cybVar, 300L, new gwc(15, this));
        linearLayout.addView(cybVar);
        n1g.N(new vqa(this, (lq4) null, 21), linearLayout);
        return linearLayout;
    }
}
