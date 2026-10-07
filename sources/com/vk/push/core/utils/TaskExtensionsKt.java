package com.vk.push.core.utils;

import defpackage.cf7;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.fjh;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.ljh;
import defpackage.lq4;
import defpackage.mdh;
import defpackage.ore;
import defpackage.poe;
import defpackage.ptb;
import defpackage.qf7;
import defpackage.roe;
import defpackage.sbi;
import defpackage.ux8;
import defpackage.xt4;
import defpackage.yab;
import defpackage.z45;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Lgu4;", "Lkotlin/Function1;", "Llq4;", "Lroe;", "", "taskResult", "Lljh;", "wrapInTask", "(Lgu4;Lcf7;)Lljh;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TaskExtensionsKt {
    public static final <T> ljh wrapInTask(final gu4 gu4Var, cf7 cf7Var) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(gu4Var, cf7Var);
        ljh ljhVar = new ljh();
        anonymousClass1.invoke((Object) new fjh(ljhVar));
        xt4 xt4Var = (xt4) gu4Var.k().x0(xt4.b);
        Executor executorB = xt4Var != null ? ch3.b(xt4Var) : null;
        if (executorB == null) {
            ljhVar.a(new ptb() { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$1
                @Override // defpackage.ptb
                public final void onComplete(Throwable th) {
                    if (th instanceof TaskCancellationException) {
                        cqk.g(gu4Var);
                    }
                }
            }, null);
            return ljhVar;
        }
        ljhVar.a(new ptb() { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$2
            @Override // defpackage.ptb
            public final void onComplete(Throwable th) {
                if (th instanceof TaskCancellationException) {
                    cqk.g(gu4Var);
                }
            }
        }, executorB);
        return ljhVar;
    }

    /* JADX INFO: renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lfjh;", "Lljh;", "Lsbi;", "invoke", "(Lfjh;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends ux8 implements cf7 {
        public final /* synthetic */ gu4 a;
        public final /* synthetic */ cf7 b;

        /* JADX INFO: renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lgu4;", "Lsbi;", "<anonymous>", "(Lgu4;)V"}, k = 3, mv = {1, 7, 1})
        @z45(c = "com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1", f = "TaskExtensions.kt", l = {17}, m = "invokeSuspend")
        public static final class C00021 extends mdh implements qf7 {
            public int e;
            public final /* synthetic */ cf7 f;
            public final /* synthetic */ fjh g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(cf7 cf7Var, fjh fjhVar, lq4 lq4Var) {
                super(2, lq4Var);
                this.f = cf7Var;
                this.g = fjhVar;
            }

            @Override // defpackage.mq0
            public final lq4 create(Object obj, lq4 lq4Var) {
                return new C00021(this.f, this.g, lq4Var);
            }

            @Override // defpackage.qf7
            public final Object invoke(gu4 gu4Var, lq4 lq4Var) {
                return ((C00021) create(gu4Var, lq4Var)).invokeSuspend(sbi.a);
            }

            @Override // defpackage.mq0
            public final Object invokeSuspend(Object obj) {
                int i = this.e;
                if (i == 0) {
                    ch3.d0(obj);
                    this.e = 1;
                    obj = this.f.invoke(this);
                    hu4 hu4Var = hu4.a;
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                Object obj2 = ((roe) obj).a;
                boolean z = obj2 instanceof poe;
                fjh fjhVar = this.g;
                if (!z) {
                    fjhVar.b(obj2);
                }
                Throwable thA = roe.a(obj2);
                if (thA != null) {
                    fjhVar.a(thA);
                }
                return sbi.a;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                Object obj2 = ((roe) this.f.invoke(this)).a;
                boolean z = obj2 instanceof poe;
                fjh fjhVar = this.g;
                if (!z) {
                    fjhVar.b(obj2);
                }
                Throwable thA = roe.a(obj2);
                if (thA != null) {
                    fjhVar.a(thA);
                }
                return sbi.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(gu4 gu4Var, cf7 cf7Var) {
            super(1);
            this.a = gu4Var;
            this.b = cf7Var;
        }

        public final void invoke(fjh fjhVar) {
            yab.i0(this.a, null, 0, new C00021(this.b, fjhVar, null), 3);
        }

        @Override // defpackage.cf7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((fjh) obj);
            return sbi.a;
        }
    }
}
