package one.me.sdk.arch;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.aa;
import defpackage.af7;
import defpackage.ar;
import defpackage.b9b;
import defpackage.br4;
import defpackage.c;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.e9i;
import defpackage.ei3;
import defpackage.en6;
import defpackage.fwj;
import defpackage.fz6;
import defpackage.g19;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.gvj;
import defpackage.ha9;
import defpackage.hfj;
import defpackage.hr4;
import defpackage.hve;
import defpackage.hvj;
import defpackage.i19;
import defpackage.iib;
import defpackage.ivj;
import defpackage.j8e;
import defpackage.j95;
import defpackage.je9;
import defpackage.ke9;
import defpackage.lhb;
import defpackage.lr4;
import defpackage.lve;
import defpackage.lvj;
import defpackage.mvj;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nre;
import defpackage.nvj;
import defpackage.nw0;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.or4;
import defpackage.ore;
import defpackage.ovj;
import defpackage.ow0;
import defpackage.poe;
import defpackage.pvj;
import defpackage.qf7;
import defpackage.qv1;
import defpackage.r3f;
import defpackage.rjj;
import defpackage.rx8;
import defpackage.sbi;
import defpackage.t3f;
import defpackage.tre;
import defpackage.v09;
import defpackage.vo8;
import defpackage.vsc;
import defpackage.vv;
import defpackage.wq4;
import defpackage.ww3;
import defpackage.xx6;
import defpackage.y6;
import defpackage.y7j;
import defpackage.yjg;
import defpackage.yr3;
import defpackage.z56;
import defpackage.zo5;
import defpackage.zp3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.internal.BinderNotFoundValueException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0002\u009a\u0001\b&\u0018\u0000 ¶\u00012\u00020\u0001:\u00046[·\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0015¢\u0006\u0004\b\u001f\u0010\u001eJ5\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\n\b\u0000\u0010!\u0018\u0001*\u00020 2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J?\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\n\b\u0000\u0010!\u0018\u0001*\u00020 2\u0006\u0010(\u001a\u00020'2\u0010\b\n\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010+J;\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\b\b\u0000\u0010!*\u00020 2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\"H\u0001¢\u0006\u0004\b0\u00101JG\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\b\b\u0000\u0010!*\u00020 2\u0006\u0010(\u001a\u00020'2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"H\u0001¢\u0006\u0004\b2\u00103J1\u00108\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001042\u0014\b\u0004\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00028\u000005H\u0085\bø\u0001\u0000¢\u0006\u0004\b8\u00109J)\u00108\u001a\u00020\r2\u0014\b\u0004\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\r05H\u0085\bø\u0001\u0000¢\u0006\u0004\b8\u0010:J%\u0010>\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010;*\u00020\t2\b\b\u0001\u0010=\u001a\u00020<H\u0004¢\u0006\u0004\b>\u0010?J/\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000A\"\b\b\u0000\u0010@*\u00020\t2\b\b\u0001\u0010=\u001a\u00020<H\u0004¢\u0006\u0004\bB\u0010CJ-\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F\"\b\b\u0000\u0010@*\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0004¢\u0006\u0004\bG\u0010HJ=\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020J0A2\b\b\u0001\u0010I\u001a\u00020<2\u0016\b\u0002\u0010K\u001a\u0010\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\r\u0018\u000105H\u0004¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020N0A2\b\b\u0001\u0010I\u001a\u00020<H\u0004¢\u0006\u0004\bO\u0010CJ#\u0010S\u001a\u0004\u0018\u00010\u00002\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010P\u001a\u00020\u0000H\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\r2\u0006\u0010T\u001a\u00020\u0002H\u0015¢\u0006\u0004\bU\u0010\u0005J\u0017\u0010W\u001a\u00020\r2\u0006\u0010V\u001a\u00020\u0002H\u0015¢\u0006\u0004\bW\u0010\u0005J\u0019\u0010Y\u001a\u00020\r2\b\u0010X\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\bY\u0010ZJ#\u0010_\u001a\u0004\u0018\u00010\u00002\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010\\\u001a\u00020[H\u0000¢\u0006\u0004\b]\u0010^J_\u0010i\u001a\u00020h\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000`2\b\b\u0002\u0010b\u001a\u00020a2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c2$\b\u0004\u0010g\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0f\u0012\u0006\u0012\u0004\u0018\u00010D0eH\u0084\bø\u0001\u0000¢\u0006\u0004\bi\u0010jJ.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0006\b\u0000\u0010@\u0018\u00012\u0006\u0010k\u001a\u00020c2\u0006\u0010l\u001a\u00028\u0000H\u0084\b¢\u0006\u0004\b\u0003\u0010nJ&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0006\b\u0000\u0010@\u0018\u00012\u0006\u0010k\u001a\u00020cH\u0084\b¢\u0006\u0004\b\u0003\u0010oJ1\u0010p\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001042\u0014\b\u0004\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u000005H\u0084\bø\u0001\u0000¢\u0006\u0004\bp\u00109J)\u0010p\u001a\u00020\r2\u0014\b\u0004\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r05H\u0084\bø\u0001\u0000¢\u0006\u0004\bp\u0010:J\u0019\u0010q\u001a\u0004\u0018\u00010\u00002\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010ZR\u0014\u0010u\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR \u0010|\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020{0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001d\u0010(\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0086\u0001\u001a\u00030\u0082\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010\u007f\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0092\u0001\u0010\u0094\u0001R\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010vR\u001f\u0010\u0096\u0001\u001a\u00020<8\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u0012\u0006\b \u0001\u0010¡\u0001R\u0015\u0010¥\u0001\u001a\u00030¢\u00018F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010©\u0001\u001a\u00030¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010\u00ad\u0001\u001a\u00030ª\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010¯\u0001\u001a\u00030¦\u00018F¢\u0006\b\u001a\u0006\b®\u0001\u0010¨\u0001R.\u0010µ\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010°\u0001\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006¸\u0001"}, d2 = {"Lone/me/sdk/arch/Widget;", "Lbr4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lar;", "requireActivity", "()Lar;", "Landroid/view/View;", "requireView", "()Landroid/view/View;", "newArgs", "Lsbi;", "updateArgs", "oldArgs", "onUpdateArgs", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;)V", "Lgr4;", "changeHandler", "Lhr4;", "changeType", "onChangeStarted", "(Lgr4;Lhr4;)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "La8j;", "VM", "Lkotlin/Function0;", "vmProducer", "Lny8;", "viewModel", "(Laf7;)Lny8;", "Lt3f;", "scopeId", "defaultFactory", "sharedViewModel", "(Lt3f;Laf7;)Lny8;", "Ljava/lang/Class;", "viewModelClass", "Ly7j;", "factoryProducer", "createViewModelLazy", "(Ljava/lang/Class;Laf7;)Lny8;", "getSharedViewModel", "(Lt3f;Ljava/lang/Class;Laf7;)Lny8;", "R", "Lkotlin/Function1;", "Lmvj;", "action", "onViewReady", "(Lcf7;)Ljava/lang/Object;", "(Lcf7;)V", "V", "", "id", "findViewById", "(I)Landroid/view/View;", "T", "Lj8e;", "viewBinding", "(I)Lj8e;", "", "bindAction", "Low0;", "binding", "(Laf7;)Low0;", "containerId", "Lhve;", "routerBuilder", "childRouter", "(ILcf7;)Lj8e;", "Lzp3;", "childSlotRouter", "ignored", "findWidget$arch", "(Lt3f;Lone/me/sdk/arch/Widget;)Lone/me/sdk/arch/Widget;", "findWidget", "outState", "onSaveInstanceState", "savedInstanceState", "onRestoreInstanceState", "target", "setTargetController", "(Lbr4;)V", "Llvj;", "type", "findWidgetByScopeId$arch", "(Lt3f;Llvj;)Lone/me/sdk/arch/Widget;", "findWidgetByScopeId", "Lxx6;", "Ln09;", "minActiveState", "", "ownerTag", "Lkotlin/Function2;", "Llq4;", "block", "Lvo8;", "collectInViewScope", "(Lxx6;Ln09;Ljava/lang/String;Lqf7;)Lvo8;", "key", "defaultValue", "Lvv;", "(Ljava/lang/String;Ljava/lang/Object;)Lvv;", "(Ljava/lang/String;)Lvv;", "doActionIfRootExist", "getParentWidgetByScopeId", "(Lt3f;)Lone/me/sdk/arch/Widget;", "controller", "finalizeCleanActions", "tag", "Ljava/lang/String;", "Lfwj;", "viewModelStore", "Lfwj;", "Lb9b;", "Lyr3;", "cleanActions", "Lb9b;", "scopeId$delegate", "Lny8;", "getScopeId", "()Lt3f;", "Ly6;", "accountScope$delegate", "getAccountScope-uqN4xOY", "()Lr3f;", "accountScope", "Loi8;", "insetsConfig", "Loi8;", "getInsetsConfig", "()Loi8;", "Ld4f;", "screenDelegate", "Ld4f;", "getScreenDelegate", "()Ld4f;", "", "isDialog", "Z", "()Z", "internalTargetInstanceId", "orientation", "I", "getOrientation", "()I", "pvj", "internalLifecycleListener", "Lpvj;", "Lor4;", "_viewLifecycleOwner", "Lor4;", "get_viewLifecycleOwner$annotations", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lv09;", "getLifecycleScope", "()Lv09;", "lifecycleScope", "Lg19;", "getViewLifecycleOwner", "()Lg19;", "viewLifecycleOwner", "getViewLifecycleScope", "viewLifecycleScope", SdkMetricStatEvent.VALUE_KEY, "getTargetWidget", "()Lone/me/sdk/arch/Widget;", "setTargetWidget", "(Lone/me/sdk/arch/Widget;)V", "targetWidget", "Companion", "ivj", "arch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class Widget extends br4 {
    public static final String ARG_ACCOUNT_ID_OVERRIDE = "arg_account_id_override";
    public static final String ARG_SCOPE_ID = "arg_key_scope_id";
    private static final String ARG_TARGET_KEY_INSTANCE = "target_key_instance_internal";
    public static final ivj Companion = new ivj();
    private static af7 externalLifecycleListener;
    private or4 _viewLifecycleOwner;

    /* JADX INFO: renamed from: accountScope$delegate, reason: from kotlin metadata */
    private final ny8 accountScope;
    private final b9b cleanActions;
    private final oi8 insetsConfig;
    private final pvj internalLifecycleListener;
    private String internalTargetInstanceId;
    private final boolean isDialog;
    private final int orientation;

    /* JADX INFO: renamed from: scopeId$delegate, reason: from kotlin metadata */
    private final ny8 scopeId;
    private final d4f screenDelegate;
    private final String tag;
    private final fwj viewModelStore;

    public Widget(Bundle bundle) {
        wq4 wq4Var;
        super(bundle);
        this.tag = getClass().getName();
        this.viewModelStore = new fwj();
        this.cleanActions = new b9b(3);
        af7 af7Var = externalLifecycleListener;
        if (af7Var != null && (wq4Var = (wq4) af7Var.invoke()) != null) {
            addLifecycleListener(wq4Var);
        }
        this.scopeId = rx8.P(3, new yjg(bundle, 3, this));
        this.accountScope = rx8.P(3, new ei3(16, this));
        this.insetsConfig = oi8.e;
        this.screenDelegate = lhb.l;
        this.orientation = -1;
        pvj pvjVar = new pvj(this);
        this.internalLifecycleListener = pvjVar;
        or4 or4Var = new or4();
        or4Var.a = new i19(or4Var);
        addLifecycleListener(new lr4(1, or4Var));
        this._viewLifecycleOwner = or4Var;
        addLifecycleListener(pvjVar);
        addLifecycleListener(ke9.a);
    }

    public static final Object binding$lambda$0(af7 af7Var, Object obj) {
        return af7Var.invoke();
    }

    public static final sbi binding$lambda$1(Widget widget, Object obj, yr3 yr3Var) {
        widget.cleanActions.k(obj, yr3Var);
        return sbi.a;
    }

    public static /* synthetic */ j8e childRouter$default(Widget widget, int i, cf7 cf7Var, int i2, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: childRouter");
            return null;
        }
        if ((i2 & 2) != 0) {
            cf7Var = null;
        }
        return widget.childRouter(i, cf7Var);
    }

    public static final hve childRouter$lambda$0(Widget widget, int i, cf7 cf7Var, hve hveVar) {
        ViewGroup viewGroup = (ViewGroup) widget.requireView().findViewById(i);
        if (cf7Var == null) {
            return widget.getChildRouter(viewGroup);
        }
        hve childRouter = widget.getChildRouter(viewGroup);
        cf7Var.invoke(childRouter);
        return childRouter;
    }

    public static final zp3 childSlotRouter$lambda$0(Widget widget, int i, zp3 zp3Var) {
        return new zp3(widget.getChildRouter((ViewGroup) widget.requireView().findViewById(i)));
    }

    public static vo8 collectInViewScope$default(Widget widget, xx6 xx6Var, n09 n09Var, String str, qf7 qf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: collectInViewScope");
            return null;
        }
        if ((i & 1) != 0) {
            n09Var = n09.d;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return e9i.j0(new fz6(n1g.v(xx6Var, widget.getViewLifecycleOwner().f(), n09Var), new rjj(str, qf7Var, null, 10), 3), widget.getViewLifecycleScope());
    }

    public final void finalizeCleanActions(br4 controller) {
        long[] jArr;
        je9 je9Var = je9.e;
        if (this.cleanActions.e()) {
            return;
        }
        String strT = np4.t(controller);
        a4c a4cVar = gm0.f;
        WeakReference weakReference = null;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strT, zo5.h(this.cleanActions.e, "view detached, call onFinalize for clean actions "), null);
        }
        b9b b9bVar = this.cleanActions;
        Object[] objArr = b9bVar.c;
        long[] jArr2 = b9bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            nw0 nw0Var = (nw0) ((yr3) objArr[(i << 3) + i4]);
                            if (!nw0Var.a) {
                                ow0 ow0Var = nw0Var.b;
                                ow0Var.e = new WeakReference(ow0Var.d);
                                ow0Var.d = weakReference;
                                nw0Var.a = true;
                            }
                            String strConcat = "Binder:".concat(np4.t(nw0Var.c));
                            ow0 ow0Var2 = nw0Var.b;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                WeakReference weakReference2 = ow0Var2.e;
                                weakReference = null;
                                a4cVar2.c(je9Var, strConcat, "onFinalize " + weakReference2 + "/" + (weakReference2 != null ? weakReference2.get() : weakReference), null);
                            } else {
                                i2 = i2;
                            }
                            WeakReference weakReference3 = nw0Var.b.e;
                            if (weakReference3 != null) {
                                weakReference3.clear();
                            }
                            nw0Var.b.e = weakReference;
                        } else {
                            jArr2 = jArr2;
                            i2 = i2;
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                jArr2 = jArr;
            }
        }
        this.cleanActions.g();
    }

    public static /* synthetic */ Widget findWidget$arch$default(Widget widget, t3f t3fVar, Widget widget2, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: findWidget");
            return null;
        }
        if ((i & 2) != 0) {
            widget2 = widget;
        }
        return widget.findWidget$arch(t3fVar, widget2);
    }

    public static /* synthetic */ Widget findWidgetByScopeId$arch$default(Widget widget, t3f t3fVar, lvj lvjVar, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: findWidgetByScopeId");
            return null;
        }
        if ((i & 2) != 0) {
            lvjVar = lvj.d;
        }
        return widget.findWidgetByScopeId$arch(t3fVar, lvjVar);
    }

    public static final CharSequence findWidgetByScopeId$lambda$4(hve hveVar) {
        return ww3.z1(hveVar.e(), ",", "[", "]", new hfj(2), 24);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    public static final CharSequence findWidgetByScopeId$lambda$4$0(lve lveVar) {
        StringBuilder sb = new StringBuilder();
        String str = lveVar.b;
        br4 br4Var = lveVar.a;
        if (str != null) {
            sb.append(str);
        } else {
            sb.append('_');
        }
        sb.append('/');
        Widget widget = br4Var instanceof Widget ? (Widget) br4Var : null;
        t3f a = widget != null ? widget.getE() : null;
        if (a != null) {
            Parcelable.Creator<t3f> creator = t3f.CREATOR;
            if (a.equals(t3f.d) || a.equals(t3f.e)) {
                sb.append('_');
            } else {
                sb.append(a.toString());
            }
        } else {
            sb.append('_');
        }
        sb.append('/');
        sb.append(br4Var.getClass().getName());
        return sb.toString();
    }

    private final Widget getParentWidgetByScopeId(t3f scopeId) {
        Parcelable.Creator<t3f> creator = t3f.CREATOR;
        if (cqk.d(scopeId, t3f.d) || cqk.d(scopeId, t3f.e)) {
            return null;
        }
        return rx8.y(getRouter().i(), scopeId, this);
    }

    public static /* synthetic */ ny8 getSharedViewModel$default(Widget widget, t3f t3fVar, Class cls, af7 af7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: getSharedViewModel");
            return null;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        return widget.getSharedViewModel(t3fVar, cls, af7Var);
    }

    private static /* synthetic */ void get_viewLifecycleOwner$annotations() {
    }

    public static final t3f scopeId_delegate$lambda$0(Bundle bundle, Widget widget) {
        t3f t3fVarScopeId_delegate$lambda$0$getDefaultScopeId;
        if (bundle == null) {
            String str = widget.tag;
            a aVar = new a("args == null");
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.g;
                String message = aVar.getMessage();
                if (message == null) {
                    message = "";
                }
                a4c.f(a4cVar, je9Var, str, message, null, aVar, 8);
            }
        }
        if (bundle == null || !bundle.containsKey(ARG_SCOPE_ID)) {
            t3fVarScopeId_delegate$lambda$0$getDefaultScopeId = scopeId_delegate$lambda$0$getDefaultScopeId(bundle, widget);
        } else {
            Object obj = bundle.get(ARG_SCOPE_ID);
            if (obj instanceof String) {
                t3fVarScopeId_delegate$lambda$0$getDefaultScopeId = new t3f((String) obj, scopeId_delegate$lambda$0$getLocalAccountIdOverride(bundle, widget));
            } else {
                t3fVarScopeId_delegate$lambda$0$getDefaultScopeId = obj instanceof t3f ? (t3f) obj : scopeId_delegate$lambda$0$getDefaultScopeId(bundle, widget);
            }
        }
        String strT = np4.t(widget);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.c;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, strT, qv1.i("Scope id init with LocalAccountId = ", t3fVarScopeId_delegate$lambda$0$getDefaultScopeId.b()), null);
            }
        }
        return t3fVarScopeId_delegate$lambda$0$getDefaultScopeId;
    }

    private static final t3f scopeId_delegate$lambda$0$getDefaultScopeId(Bundle bundle, Widget widget) {
        return new t3f(null, scopeId_delegate$lambda$0$getLocalAccountIdOverride(bundle, widget), 1);
    }

    private static final ha9 scopeId_delegate$lambda$0$getLocalAccountIdOverride(Bundle bundle, Widget widget) {
        if (bundle != null && bundle.containsKey(ARG_ACCOUNT_ID_OVERRIDE)) {
            return new ha9(bundle.getInt(ARG_ACCOUNT_ID_OVERRIDE));
        }
        String str = widget.tag;
        a aVar = new a("ARG_ACCOUNT_ID_OVERRIDE not present");
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.g;
            String message = aVar.getMessage();
            if (message == null) {
                message = "";
            }
            a4c.f(a4cVar, je9Var, str, message, null, aVar, 8);
        }
        return ha9.b;
    }

    public static /* synthetic */ ny8 sharedViewModel$default(Widget widget, t3f t3fVar, af7 af7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedViewModel");
        }
        cqk.F();
        throw null;
    }

    public static final View viewBinding$lambda$0(Widget widget, int i, View view) {
        Object poeVar;
        if (view != null) {
        }
        try {
            return widget.requireView().findViewById(i);
        } catch (Throwable th) {
            gm0.r(widget.tag, "Original Binder exception:", th);
            try {
                poeVar = widget.getContext().getResources().getResourceName(i);
            } catch (Throwable th2) {
                poeVar = new poe(th2);
            }
            Object objH = zo5.h(i, "#");
            if (poeVar instanceof poe) {
                poeVar = objH;
            }
            throw new BinderNotFoundValueException("could not find view " + ((String) poeVar) + " state=" + widget._viewLifecycleOwner.a.d, th);
        }
    }

    public static final sbi viewBinding$lambda$1(Widget widget, View view, yr3 yr3Var) {
        widget.cleanActions.k(view, yr3Var);
        return sbi.a;
    }

    public static final boolean viewBinding$lambda$2(Widget widget, View view) {
        return view.getParent() == widget.getView();
    }

    public final /* synthetic */ <T> vv args(String key, T defaultValue) {
        cqk.F();
        throw null;
    }

    public final <T> ow0 binding(af7 bindAction) {
        return new ow0(this, new vsc(2, bindAction), new gvj(this, 1), 8);
    }

    public final j8e childRouter(int containerId, cf7 routerBuilder) {
        return new ow0(this, new en6(this, containerId, routerBuilder, 1), (gvj) null, 12);
    }

    public final j8e childSlotRouter(int containerId) {
        return new ow0(this, new z56(this, containerId, 1), (gvj) null, 12);
    }

    public final <T> vo8 collectInViewScope(xx6 xx6Var, n09 n09Var, String str, qf7 qf7Var) {
        return e9i.j0(new fz6(n1g.v(xx6Var, getViewLifecycleOwner().f(), n09Var), new rjj(str, qf7Var, null, 10), 3), getViewLifecycleScope());
    }

    public final <VM extends a8j> ny8 createViewModelLazy(Class<VM> viewModelClass, af7 factoryProducer) {
        y7j y7jVar = (y7j) factoryProducer.invoke();
        fwj fwjVar = this.viewModelStore;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            fwjVar.getClass();
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "WidgetViewModelStore", "put " + viewModelClass, null);
            }
        }
        fwjVar.b.o("one.me.sdk.arch.ViewModelStore:key:" + viewModelClass.getCanonicalName(), y7jVar);
        return new nvj(this, viewModelClass, y7jVar);
    }

    public final <R> R doActionIfRootExist(cf7 action) {
        View view = getView();
        if (view != null) {
            return (R) action.invoke(view);
        }
        return null;
    }

    public final <V extends View> V findViewById(int id) {
        View view = getView();
        if (view != null) {
            return (V) view.findViewById(id);
        }
        return null;
    }

    public final Widget findWidget$arch(t3f scopeId, Widget ignored) {
        if (cqk.d(getE(), scopeId)) {
            return this;
        }
        Iterator<hve> it = getChildRouters().iterator();
        while (it.hasNext()) {
            Widget widgetY = rx8.y(it.next(), scopeId, ignored);
            if (widgetY != null && widgetY != ignored) {
                return widgetY;
            }
        }
        return null;
    }

    public final Widget findWidgetByScopeId$arch(t3f scopeId, lvj type) {
        Widget widget;
        Widget widget2;
        Widget parentWidgetByScopeId;
        je9 je9Var = je9.d;
        if (scopeId.equals(t3f.e)) {
            return null;
        }
        if (scopeId.equals(t3f.d)) {
            return this;
        }
        if (type.compareTo(lvj.b) > 0) {
            widget = null;
            break;
        }
        br4 parentController = getParentController();
        while (true) {
            if (parentController == null) {
                widget = null;
                break;
            }
            Widget widget3 = parentController instanceof Widget ? (Widget) parentController : null;
            if (cqk.d(widget3 != null ? widget3.getE() : null, scopeId)) {
                String str = this.tag;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "findWidgetByScopeId: type=" + type + " result for " + scopeId + " = parent " + parentController, null);
                }
                widget = (Widget) parentController;
                break;
            }
            parentController = parentController.getParentController();
        }
        if (widget == null && type.compareTo(lvj.c) <= 0) {
            Widget targetWidget = getTargetWidget();
            boolean zD = cqk.d(targetWidget != null ? targetWidget.getE() : null, scopeId);
            String str2 = this.tag;
            if (zD) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "findWidgetByScopeId: type=" + type + " result for " + scopeId + " = target " + targetWidget, null);
                }
                widget = targetWidget;
            } else {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str2, "findWidgetByScopeId: type=" + type + " targetWidget fail, target=" + targetWidget + ", scopeId=" + scopeId + ", target.scopeId=" + (targetWidget != null ? targetWidget.getE() : null), null);
                }
            }
        }
        if (widget != null || type.compareTo(lvj.d) > 0 || (parentWidgetByScopeId = getParentWidgetByScopeId(scopeId)) == null) {
            widget2 = widget;
        } else {
            String str3 = this.tag;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str3, "findWidgetByScopeId: type=" + type + " result for " + scopeId + " = everywhere(" + scopeId + ")", null);
            }
            widget2 = parentWidgetByScopeId;
        }
        if (widget2 == null) {
            String strZ1 = ww3.z1(getRouter().j(), ",", "[", "]", new nre(17), 24);
            String name = getClass().getName();
            br4 parentController2 = getParentController();
            String name2 = parentController2 != null ? parentController2.getClass().getName() : null;
            String str4 = this.internalTargetInstanceId;
            br4 targetController = getTargetController();
            iib iibVar = new iib(scopeId, name, name2, str4, targetController != null ? targetController.getClass().getName() : null, strZ1, type);
            String str5 = this.tag;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar5.b(je9Var2)) {
                    a4cVar5.c(je9Var2, str5, "Try find widget by ScopeId:" + scopeId + " for type=" + type + " but didn't find: " + iibVar.getMessage(), iibVar);
                }
            }
        }
        return widget2;
    }

    /* JADX INFO: renamed from: getAccountScope-uqN4xOY */
    public final r3f m35getAccountScopeuqN4xOY() {
        return ((y6) this.accountScope.getValue()).a;
    }

    public final Context getContext() {
        return requireActivity();
    }

    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public oi8 getD() {
        return this.insetsConfig;
    }

    public final v09 getLifecycleScope() {
        return tre.d0(this.lifecycleOwner);
    }

    /* JADX INFO: renamed from: getOrientation, reason: from getter */
    public int getG() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: getScopeId */
    public t3f getE() {
        return (t3f) this.scopeId.getValue();
    }

    /* JADX INFO: renamed from: getScreenDelegate, reason: from getter */
    public d4f getE() {
        return this.screenDelegate;
    }

    public final <VM extends a8j> ny8 getSharedViewModel(t3f scopeId, Class<VM> viewModelClass, af7 defaultFactory) {
        return new ovj(this, scopeId, viewModelClass, defaultFactory);
    }

    public final Widget getTargetWidget() {
        br4 targetController = getTargetController();
        if (targetController instanceof Widget) {
            return (Widget) targetController;
        }
        return null;
    }

    public final g19 getViewLifecycleOwner() {
        return this._viewLifecycleOwner;
    }

    public final v09 getViewLifecycleScope() {
        return tre.d0(this._viewLifecycleOwner);
    }

    /* JADX INFO: renamed from: isDialog, reason: from getter */
    public boolean getIsDialog() {
        return this.isDialog;
    }

    @Override // defpackage.br4
    public void onActivityPaused(Activity activity) {
    }

    @Override // defpackage.br4
    public void onActivityResumed(Activity activity) {
    }

    @Override // defpackage.br4
    public void onChangeStarted(gr4 changeHandler, hr4 changeType) {
        if (changeType == hr4.e || changeType == hr4.c) {
            getE().b();
        }
    }

    @Override // defpackage.br4
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        this.internalTargetInstanceId = savedInstanceState.getString(ARG_TARGET_KEY_INSTANCE);
    }

    @Override // defpackage.br4
    public void onSaveInstanceState(Bundle outState) {
        String str = this.internalTargetInstanceId;
        if (str != null) {
            outState.putString(ARG_TARGET_KEY_INSTANCE, str);
        }
    }

    public void onUpdateArgs(Bundle oldArgs, Bundle newArgs) {
    }

    public void onViewCreated(View view) {
    }

    public final <R> R onViewReady(cf7 action) {
        if (getView() != null) {
            return (R) action.invoke(mvj.a);
        }
        return null;
    }

    public final ar requireActivity() {
        return (ar) getActivity();
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        ore.p("view is null!");
        return null;
    }

    @Override // defpackage.br4
    public void setTargetController(br4 target) {
        this.internalTargetInstanceId = target != null ? target.getInstanceId() : null;
        super.setTargetController(target);
    }

    public final void setTargetWidget(Widget widget) {
        setTargetController(widget);
    }

    public final /* synthetic */ <VM extends a8j> ny8 sharedViewModel(t3f scopeId, af7 defaultFactory) {
        cqk.F();
        throw null;
    }

    public final void updateArgs(Bundle newArgs) {
        Bundle bundleDeepCopy = getArgs().deepCopy();
        getArgs().clear();
        getArgs().putAll(newArgs);
        onUpdateArgs(bundleDeepCopy, getArgs());
    }

    public final <T extends View> j8e viewBinding(int id) {
        return new ow0(this, new aa(this, id, 2), new gvj(this, 0), new hvj(this, 0));
    }

    public final /* synthetic */ <VM extends a8j> ny8 viewModel(af7 vmProducer) {
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> vv args(String key) {
        cqk.F();
        throw null;
    }

    /* JADX INFO: renamed from: doActionIfRootExist */
    public final void m36doActionIfRootExist(cf7 action) {
        View view = getView();
        if (view != null) {
            action.invoke(view);
        }
    }

    /* JADX INFO: renamed from: onViewReady */
    public final void m37onViewReady(cf7 action) {
        if (getView() != null) {
            action.invoke(mvj.a);
        }
    }

    public Widget() {
        this(null, 1, null);
    }

    public /* synthetic */ Widget(Bundle bundle, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
