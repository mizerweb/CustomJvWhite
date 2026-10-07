package com.google.android.gms.tasks;

import defpackage.kam;

/* JADX INFO: loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException a(kam kamVar) {
        String strConcat;
        if (!kamVar.i()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excG = kamVar.g();
        if (excG != null) {
            strConcat = "failure";
        } else if (kamVar.j()) {
            strConcat = "result ".concat(String.valueOf(kamVar.h()));
        } else {
            strConcat = kamVar.d ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excG);
    }
}
