package com.vk.push.core.filedatastore;

import defpackage.cf7;
import defpackage.lq4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00042\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/vk/push/core/filedatastore/FileDataStore;", "T", "", "data", "", "write", "(Ljava/lang/Object;Llq4;)Ljava/lang/Object;", "read", "(Llq4;)Ljava/lang/Object;", "Lkotlin/Function1;", "transform", "edit", "(Lcf7;Llq4;)Ljava/lang/Object;", "clear", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FileDataStore<T> {
    Object clear(lq4 lq4Var);

    Object edit(cf7 cf7Var, lq4 lq4Var);

    Object read(lq4 lq4Var);

    Object write(T t, lq4 lq4Var);
}
