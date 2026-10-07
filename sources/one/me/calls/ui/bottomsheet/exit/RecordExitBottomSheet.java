package one.me.calls.ui.bottomsheet.exit;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.af7;
import defpackage.ap3;
import defpackage.atf;
import defpackage.bsb;
import defpackage.cde;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.dde;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h02;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j95;
import defpackage.jz;
import defpackage.k9d;
import defpackage.kbc;
import defpackage.kde;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.ow0;
import defpackage.pq3;
import defpackage.qt4;
import defpackage.rx8;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.vv;
import defpackage.wf4;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lcde;", "openType", "", "enableRecordInCall", "(Lt3f;Lcde;Ljava/lang/Boolean;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecordExitBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] E = {new dwd(RecordExitBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, RecordExitBottomSheet.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new dwd(RecordExitBottomSheet.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new dwd(RecordExitBottomSheet.class, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RecordExitBottomSheet.class, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RecordExitBottomSheet.class, "recordInfo", "getRecordInfo()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0), new dwd(RecordExitBottomSheet.class, "needRemoveView", "getNeedRemoveView()Lone/me/calls/ui/view/CheckBoxWithPaddingFix;", 0)};
    public final ow0 A;
    public final ow0 B;
    public final ow0 C;
    public final ow0 D;
    public final ny8 u;
    public final sx1 v;
    public final ny8 w;
    public final ny8 x;
    public final ow0 y;
    public final ow0 z;

    public RecordExitBottomSheet(Bundle bundle) {
        super(bundle);
        final int i = 0;
        final int i2 = 3;
        this.u = rx8.P(3, new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i4 = 0; i4 < 8; i4++) {
                            fArr[i4] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
        this.v = new sx1(m35getAccountScopeuqN4xOY());
        vv vvVar = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        zv8 zv8Var = E[0];
        this.w = getSharedViewModel(new t3f("CALL_SCREEN_SCOPE_ID", ((t3f) vvVar.a(this)).b()), h02.class, null);
        final int i3 = 5;
        this.x = createViewModelLazy(kde.class, new ztd(i3, new k9d(this, 21, bundle)));
        final int i4 = 1;
        this.y = binding(new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i6 = 0; i6 < 8; i6++) {
                            fArr[i6] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
        final int i5 = 2;
        this.z = binding(new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr[i7] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
        this.A = binding(new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i2;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr[i7] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
        final int i6 = 4;
        this.B = binding(new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i7) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i8 = 0; i8 < 8; i8++) {
                            fArr[i8] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
        this.C = binding(new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i3;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i7) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i8 = 0; i8 < 8; i8++) {
                            fArr[i8] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
        final int i7 = 6;
        this.D = binding(new af7(this) { // from class: bde
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                a8g a8gVar = pq3.j;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i8) {
                    case 0:
                        zv8[] zv8VarArr = RecordExitBottomSheet.E;
                        return so2.F(recordExitBottomSheet.getContext(), 6);
                    case 1:
                        zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(R.id.call_screen_record_manage_title);
                        q9i.a(q9i.c, textView);
                        textView.setTextColor(a8gVar.l(textView).b.getText().b);
                        textView.setGravity(17);
                        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        zv8[] zv8VarArr3 = RecordExitBottomSheet.E;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(R.id.call_screen_record_manage_subtitle);
                        q9i.a(q9i.i, textView2);
                        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        zv8[] zv8VarArr4 = RecordExitBottomSheet.E;
                        cyb cybVar = new cyb(recordExitBottomSheet.getContext());
                        cybVar.setId(R.id.call_screen_record_manage_negative_btn);
                        cybVar.setSize(ayb.g);
                        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
                        return cybVar;
                    case 4:
                        zv8[] zv8VarArr5 = RecordExitBottomSheet.E;
                        cyb cybVar2 = new cyb(recordExitBottomSheet.getContext());
                        cybVar2.setId(R.id.call_screen_record_manage_positive_btn);
                        cybVar2.setSize(ayb.g);
                        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
                        return cybVar2;
                    case 5:
                        zv8[] zv8VarArr6 = RecordExitBottomSheet.E;
                        atf atfVar = new atf(recordExitBottomSheet.getContext());
                        atfVar.setDisableStartIconText(true);
                        atfVar.setId(R.id.call_screen_record_manage_record_info);
                        atfVar.setItemId(R.id.call_screen_record_manage_record_info);
                        atfVar.setStartView(new bz8(R.drawable.ic_record_24, a8gVar.l(atfVar).b.h().d, 4));
                        atfVar.setType(osf.b);
                        float[] fArr = new float[8];
                        for (int i9 = 0; i9 < 8; i9++) {
                            fArr[i9] = yl5.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
                        atfVar.setBackground(shapeDrawable);
                        atfVar.setThemeDepended(usf.b);
                        return atfVar;
                    default:
                        zv8[] zv8VarArr7 = RecordExitBottomSheet.E;
                        ap3 ap3Var = new ap3(recordExitBottomSheet.getContext());
                        ap3Var.setId(R.id.call_screen_record_manage_record_need_remove);
                        ap3Var.setText(R.string.call_screen_record_admin_exit_need_remove);
                        q9i.a(q9i.f, ap3Var);
                        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
                        ny8 ny8Var = recordExitBottomSheet.u;
                        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
                        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
                        ap3Var.setChecked(false);
                        ap3Var.setVisibility(8);
                        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return ap3Var;
                }
            }
        });
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        wf4Var.addView(K1(), -1, -2);
        wf4Var.addView(J1(), -1, -2);
        wf4Var.addView(I1(), -1, -2);
        wf4Var.addView(G1(), 0, -2);
        wf4Var.addView(H1(), 0, -2);
        wf4Var.addView(F1(), 0, -2);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = K1().getId();
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 4, J1().getId(), 3);
        eg4VarH.g(id).d.W = 2;
        int id2 = J1().getId();
        eg4VarH.d(id2, 3, K1().getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 4, I1().getId(), 3);
        int id3 = I1().getId();
        eg4VarH.d(id3, 3, J1().getId(), 4);
        qt4.w(22.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 4, F1().getId(), 3);
        int id4 = F1().getId();
        eg4VarH.d(id4, 3, I1().getId(), 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        new bsb(6, eg4VarH, id4).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id4, 4, G1().getId(), 3);
        int id5 = G1().getId();
        eg4VarH.d(id5, 3, F1().getId(), 4);
        new bsb(3, eg4VarH, id5).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id5, 7, H1().getId(), 6);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id5));
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 4, 0, 3);
        int id6 = H1().getId();
        eg4VarH.d(id6, 3, G1().getId(), 3);
        eg4VarH.d(id6, 7, 0, 7);
        eg4VarH.d(id6, 6, G1().getId(), 7);
        new bsb(6, eg4VarH, id6).a(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id6, 4, G1().getId(), 4);
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    public final ap3 F1() {
        zv8 zv8Var = E[6];
        return (ap3) this.D.getValue();
    }

    public final cyb G1() {
        zv8 zv8Var = E[3];
        return (cyb) this.A.getValue();
    }

    public final cyb H1() {
        zv8 zv8Var = E[4];
        return (cyb) this.B.getValue();
    }

    public final atf I1() {
        zv8 zv8Var = E[5];
        return (atf) this.C.getValue();
    }

    public final TextView J1() {
        zv8 zv8Var = E[2];
        return (TextView) this.z.getValue();
    }

    public final TextView K1() {
        zv8 zv8Var = E[1];
        return (TextView) this.y.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ny8 ny8Var = this.x;
        ic6 ic6Var = ((kde) ny8Var.getValue()).l;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new dde(null, this, 0), i), getViewLifecycleScope());
        if (((kde) ny8Var.getValue()).c == cde.b) {
            e9i.j0(new fz6(n1g.v(((kde) ny8Var.getValue()).k, getViewLifecycleOwner().f(), n09Var), new dde(null, this, 1), i), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(new jz(((kde) ny8Var.getValue()).j, 13), getViewLifecycleOwner().f(), n09Var), new dde(null, this, 2), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    public /* synthetic */ RecordExitBottomSheet(t3f t3fVar, cde cdeVar, Boolean bool, int i, j95 j95Var) {
        this(t3fVar, cdeVar, (i & 4) != 0 ? null : bool);
    }

    public RecordExitBottomSheet(t3f t3fVar, cde cdeVar, Boolean bool) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Widget.ARG_SCOPE_ID, t3fVar);
        bundle.putString("open_type", cdeVar.name());
        if (bool != null) {
            bundle.putBoolean("admin_record_settings", bool.booleanValue());
        }
        this(bundle);
    }
}
