package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import one.me.devmenu.utils.JsonBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xs8 {
    public final jac a;
    public final jac b;
    public final ImageView c;
    public final LinearLayout d;

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
    public xs8(final JsonBottomSheet jsonBottomSheet, String str, jt8 jt8Var) {
        String string;
        ifh ifhVar = jsonBottomSheet.w;
        zv8[] zv8VarArr = JsonBottomSheet.z;
        Integer numValueOf = Integer.valueOf(R.attr.button_secondary);
        LinearLayout linearLayout = jsonBottomSheet.y;
        LinearLayout linearLayout2 = new LinearLayout((linearLayout == null ? null : linearLayout).getContext());
        final int i = 0;
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setGravity(16);
        final jac jacVar = new jac(linearLayout2.getContext());
        jacVar.setText(str);
        final int i2 = 1;
        jacVar.setInputType(1);
        jacVar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 0.5f));
        jacVar.setBackgroundColorAttr(numValueOf);
        jacVar.setHint("Ключ");
        jacVar.setEndIconDrawable(null);
        this.a = jacVar;
        linearLayout2.addView(jacVar);
        if (jt8Var instanceof cu8) {
            string = ((qs8) ifhVar.getValue()).b(cu8.Companion.serializer(), jt8Var);
        } else if (jt8Var instanceof ss8) {
            string = ((qs8) ifhVar.getValue()).b(ss8.Companion.serializer(), jt8Var);
        } else {
            if (!(jt8Var instanceof pu8)) {
                ore.o();
                throw null;
            }
            pu8 pu8Var = (pu8) jt8Var;
            String strE = kt8.e(pu8Var);
            string = strE == null ? pu8Var.toString() : strE;
        }
        final jac jacVar2 = new jac(linearLayout2.getContext());
        jacVar2.setText(string);
        jacVar2.setInputType(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 0.5f);
        layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        jacVar2.setLayoutParams(layoutParams2);
        jacVar2.setBackgroundColorAttr(numValueOf);
        jacVar2.setHint("Значение");
        jacVar2.setEndIconDrawable(null);
        this.b = jacVar2;
        linearLayout2.addView(jacVar2);
        ImageView imageView = new ImageView(linearLayout2.getContext());
        imageView.setImageResource(R.drawable.icon_cross_round_fill);
        imageView.setColorFilter(pq3.j.h(imageView).getIcon().c);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        layoutParams3.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        imageView.setLayoutParams(layoutParams3);
        imageView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        imageView.setOnClickListener(new z36(jsonBottomSheet, 14, this));
        this.c = imageView;
        linearLayout2.addView(imageView);
        jacVar.b.setOnFocusChangeListener(new xga(1, new cf7(jsonBottomSheet, this, jacVar2, i) { // from class: ws8
            public final /* synthetic */ int a;
            public final /* synthetic */ xs8 b;
            public final /* synthetic */ jac c;

            {
                this.a = i;
                this.b = this;
                this.c = jacVar2;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = this.a;
                sbi sbiVar = sbi.a;
                jac jacVar3 = this.c;
                xs8 xs8Var = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr2 = JsonBottomSheet.z;
                        JsonBottomSheet.F1(xs8Var, zBooleanValue, jacVar3.hasFocus());
                        break;
                    default:
                        zv8[] zv8VarArr3 = JsonBottomSheet.z;
                        JsonBottomSheet.F1(xs8Var, jacVar3.hasFocus(), zBooleanValue);
                        break;
                }
                return sbiVar;
            }
        }));
        jacVar2.b.setOnFocusChangeListener(new xga(1, new cf7(jsonBottomSheet, this, jacVar, i2) { // from class: ws8
            public final /* synthetic */ int a;
            public final /* synthetic */ xs8 b;
            public final /* synthetic */ jac c;

            {
                this.a = i2;
                this.b = this;
                this.c = jacVar;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = this.a;
                sbi sbiVar = sbi.a;
                jac jacVar3 = this.c;
                xs8 xs8Var = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr2 = JsonBottomSheet.z;
                        JsonBottomSheet.F1(xs8Var, zBooleanValue, jacVar3.hasFocus());
                        break;
                    default:
                        zv8[] zv8VarArr3 = JsonBottomSheet.z;
                        JsonBottomSheet.F1(xs8Var, jacVar3.hasFocus(), zBooleanValue);
                        break;
                }
                return sbiVar;
            }
        }));
        this.d = linearLayout2;
    }
}
