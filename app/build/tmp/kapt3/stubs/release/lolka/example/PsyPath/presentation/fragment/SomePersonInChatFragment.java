package lolka.example.PsyPath.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Llolka/example/PsyPath/presentation/fragment/SomePersonInChatFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callBack", "Llolka/example/PsyPath/presentation/fragment/SomePersonInChatFragment$CallBack;", "getCallBack", "()Llolka/example/PsyPath/presentation/fragment/SomePersonInChatFragment$CallBack;", "setCallBack", "(Llolka/example/PsyPath/presentation/fragment/SomePersonInChatFragment$CallBack;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "registerCallBack", "CallBack", "app_release"})
public final class SomePersonInChatFragment extends androidx.fragment.app.Fragment {
    public lolka.example.PsyPath.presentation.fragment.SomePersonInChatFragment.CallBack callBack;
    
    public SomePersonInChatFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.presentation.fragment.SomePersonInChatFragment.CallBack getCallBack() {
        return null;
    }
    
    public final void setCallBack(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.SomePersonInChatFragment.CallBack p0) {
    }
    
    public final void registerCallBack(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.SomePersonInChatFragment.CallBack callBack) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Llolka/example/PsyPath/presentation/fragment/SomePersonInChatFragment$CallBack;", "", "getFocusedPerson", "", "person", "Landroid/widget/LinearLayout;", "app_release"})
    public static abstract interface CallBack {
        
        public abstract void getFocusedPerson(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout person);
    }
}