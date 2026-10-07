package com.vk.push.core.utils;

import defpackage.b35;
import defpackage.c35;
import defpackage.ch3;
import defpackage.e9i;
import defpackage.fze;
import defpackage.hu4;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.pdd;
import defpackage.sbi;
import defpackage.vdd;
import defpackage.x8b;
import defpackage.xx6;
import defpackage.yx6;
import defpackage.z45;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a;\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a3\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lb35;", "Lx8b;", "Lvdd;", "key", "getValue", "(Lb35;Lvdd;Llq4;)Ljava/lang/Object;", "defaultSavedValue", "(Lb35;Lvdd;Ljava/lang/Object;Llq4;)Ljava/lang/Object;", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "setValue", "Lxx6;", "getValueFlow", "(Lb35;Lvdd;)Lxx6;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DataStoreExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object getValue(b35 b35Var, vdd vddVar, T t, lq4 lq4Var) {
        c35 c35Var;
        if (lq4Var instanceof c35) {
            c35Var = (c35) lq4Var;
            int i = c35Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35Var.f = i - Integer.MIN_VALUE;
            } else {
                c35Var = new c35(lq4Var);
            }
        } else {
            c35Var = new c35(lq4Var);
        }
        Object value = c35Var.e;
        int i2 = c35Var.f;
        if (i2 == 0) {
            ch3.d0(value);
            c35Var.d = t;
            c35Var.f = 1;
            value = getValue(b35Var, vddVar, c35Var);
            hu4 hu4Var = hu4.a;
            if (value == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t = (T) c35Var.d;
            ch3.d0(value);
        }
        return value == null ? t : value;
    }

    public static final <T> xx6 getValueFlow(b35 b35Var, final vdd vddVar) {
        final xx6 data = b35Var.getData();
        return new xx6() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "emit", "(Ljava/lang/Object;Llq4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements yx6 {
                public final /* synthetic */ yx6 a;
                public final /* synthetic */ vdd b;

                /* JADX INFO: renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @z45(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends nq4 {
                    public /* synthetic */ Object d;
                    public int e;

                    public AnonymousClass1(lq4 lq4Var) {
                        super(lq4Var);
                    }

                    @Override // defpackage.mq0
                    public final Object invokeSuspend(Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(yx6 yx6Var, vdd vddVar) {
                    this.a = yx6Var;
                    this.b = vddVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.yx6
                public final Object emit(Object obj, lq4 lq4Var) {
                    AnonymousClass1 anonymousClass1;
                    if (lq4Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) lq4Var;
                        int i = anonymousClass1.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.e = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(lq4Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(lq4Var);
                    }
                    Object obj2 = anonymousClass1.d;
                    int i2 = anonymousClass1.e;
                    if (i2 == 0) {
                        ch3.d0(obj2);
                        Object obj3 = ((x8b) obj).a.get(this.b);
                        anonymousClass1.e = 1;
                        Object objEmit = this.a.emit(obj3, anonymousClass1);
                        hu4 hu4Var = hu4.a;
                        if (objEmit == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj2);
                    }
                    return sbi.a;
                }
            }

            @Override // defpackage.xx6
            public Object collect(yx6 yx6Var, lq4 lq4Var) {
                Object objCollect = data.collect(new AnonymousClass2(yx6Var, vddVar), lq4Var);
                return objCollect == hu4.a ? objCollect : sbi.a;
            }
        };
    }

    public static final <T> Object setValue(b35 b35Var, vdd vddVar, T t, lq4 lq4Var) {
        lq4 lq4Var2 = null;
        Object objA = b35Var.a(new pdd(new fze(t, vddVar, lq4Var2, 25), lq4Var2, 1), lq4Var);
        return objA == hu4.a ? objA : sbi.a;
    }

    public static final <T> Object getValue(b35 b35Var, final vdd vddVar, lq4 lq4Var) {
        final xx6 data = b35Var.getData();
        return e9i.P(new xx6() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1

            /* JADX INFO: renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "emit", "(Ljava/lang/Object;Llq4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements yx6 {
                public final /* synthetic */ yx6 a;
                public final /* synthetic */ vdd b;

                /* JADX INFO: renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @z45(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends nq4 {
                    public /* synthetic */ Object d;
                    public int e;

                    public AnonymousClass1(lq4 lq4Var) {
                        super(lq4Var);
                    }

                    @Override // defpackage.mq0
                    public final Object invokeSuspend(Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(yx6 yx6Var, vdd vddVar) {
                    this.a = yx6Var;
                    this.b = vddVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.yx6
                public final Object emit(Object obj, lq4 lq4Var) {
                    AnonymousClass1 anonymousClass1;
                    if (lq4Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) lq4Var;
                        int i = anonymousClass1.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.e = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(lq4Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(lq4Var);
                    }
                    Object obj2 = anonymousClass1.d;
                    int i2 = anonymousClass1.e;
                    if (i2 == 0) {
                        ch3.d0(obj2);
                        Object obj3 = ((x8b) obj).a.get(this.b);
                        anonymousClass1.e = 1;
                        Object objEmit = this.a.emit(obj3, anonymousClass1);
                        hu4 hu4Var = hu4.a;
                        if (objEmit == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj2);
                    }
                    return sbi.a;
                }
            }

            @Override // defpackage.xx6
            public Object collect(yx6 yx6Var, lq4 lq4Var2) {
                Object objCollect = data.collect(new AnonymousClass2(yx6Var, vddVar), lq4Var2);
                return objCollect == hu4.a ? objCollect : sbi.a;
            }
        }, lq4Var);
    }
}
