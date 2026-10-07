package ru.ok.tracer.minidump;

/* JADX INFO: loaded from: classes.dex */
public final class Minidump {
    public static final Minidump c = new Minidump();
    public final Object a = new Object();
    public boolean b;

    public Minidump() {
        System.loadLibrary("tracernative");
    }

    private native void installMinidumpWriterImpl(String str);

    private native void uninstallMinidumpWriterImpl();

    public final void a(String str) {
    }
}
