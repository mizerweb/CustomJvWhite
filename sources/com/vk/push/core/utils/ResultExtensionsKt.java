package com.vk.push.core.utils;

import android.os.Parcelable;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.base.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import defpackage.af7;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.poe;
import defpackage.r5h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a(\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b\"\b\b\u0000\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000bø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aY\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00160\u000bø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"", "Lcom/vk/push/core/base/AidlException;", "toAidlException", "(Ljava/lang/Throwable;)Lcom/vk/push/core/base/AidlException;", "Landroid/os/Parcelable;", "T", "Lkotlin/Function0;", "block", "Lcom/vk/push/core/base/AidlResult;", "runCatchingResult", "(Laf7;)Lcom/vk/push/core/base/AidlResult;", "Lroe;", "toAidlResult", "(Ljava/lang/Object;)Lcom/vk/push/core/base/AidlResult;", "R", "Lkotlin/Function1;", "onSuccess", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFailure", "fold", "(Lcom/vk/push/core/base/AidlResult;Lcf7;Lcf7;)Ljava/lang/Object;", "", "", "isValid", "(Ljava/lang/Object;)Z", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ResultExtensionsKt {
    public static final <R, T extends Parcelable> R fold(AidlResult<T> aidlResult, cf7 cf7Var, cf7 cf7Var2) {
        Exception excExceptionOrNull = aidlResult.exceptionOrNull();
        return excExceptionOrNull == null ? (R) cf7Var.invoke(aidlResult.getData()) : (R) cf7Var2.invoke(excExceptionOrNull);
    }

    public static final boolean isValid(Object obj) {
        boolean z = obj instanceof poe;
        if (z) {
            return false;
        }
        if (z) {
            obj = null;
        }
        CharSequence charSequence = (CharSequence) obj;
        return (charSequence == null || r5h.X0(charSequence)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Parcelable> AidlResult<?> runCatchingResult(af7 af7Var) {
        try {
            return AidlResult.INSTANCE.success((Parcelable) af7Var.invoke());
        } catch (Exception e) {
            return AidlResult.INSTANCE.failure(e);
        }
    }

    public static final AidlException toAidlException(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        if (th instanceof HostIsNotMasterException) {
            return new AidlException(AidlException.HOST_IS_NOT_MASTER, strValueOf);
        }
        if (th instanceof SdkIsNotInitializedException) {
            return new AidlException(AidlException.SDK_IS_NOT_INITIALIZED, strValueOf);
        }
        if (th instanceof TransferredIpcDataException) {
            return new AidlException(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION, strValueOf);
        }
        if (th instanceof IllegalStateException) {
            return new AidlException(102, strValueOf);
        }
        if (th instanceof IllegalArgumentException) {
            return new AidlException(101, strValueOf);
        }
        return th instanceof RuntimeException ? new AidlException(100, strValueOf) : new AidlException(0, strValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Parcelable> AidlResult<?> toAidlResult(Object obj) {
        try {
            AidlResult.Companion companion = AidlResult.INSTANCE;
            ch3.d0(obj);
            return companion.success((Parcelable) obj);
        } catch (Exception e) {
            return AidlResult.INSTANCE.failure(e);
        }
    }
}
