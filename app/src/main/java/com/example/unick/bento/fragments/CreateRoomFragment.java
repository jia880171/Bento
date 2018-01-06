package com.example.unick.bento.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.unick.bento.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CreateRoomFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CreateRoomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateRoomFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //private OnFragmentInteractionListener mListener;

    private Context context;
    private Spinner Spinner_shop,Spinner_member;
    private String[] shop_array = {"請選擇店家", "Venus 金星", "Earth 地球",
            "Mars 火星", "Jupiter 木星", "Saturn 土星",
            "Uranus 天王星", "Neptune 海王星" };
    private String[] member_array = {"請選擇訂購人", "Venus 金星", "Earth 地球",
            "Mars 火星", "Jupiter 木星", "Saturn 土星",
            "Uranus 天王星", "Neptune 海王星" };

    public CreateRoomFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreateRoomFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CreateRoomFragment newInstance(String param1, String param2) {
        CreateRoomFragment fragment = new CreateRoomFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View myInflatedView = inflater.inflate(R.layout.fragment_create_room, container,false);

        Spinner_shop = (Spinner) myInflatedView.findViewById(R.id.spinner_shop);
        ArrayAdapter<String> shop_adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,shop_array);
        shop_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner_shop.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object obj = parent.getItemAtPosition(position);
                //Toast.makeText(getContext(), "選擇：" + obj, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        Spinner_shop.setAdapter(shop_adapter);

        Spinner_member = (Spinner) myInflatedView.findViewById(R.id.spinner_member);
        ArrayAdapter<String> member_adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,member_array);
        member_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner_member.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object obj = parent.getItemAtPosition(position);
                //Toast.makeText(getContext(), "選擇：" + obj, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        Spinner_member.setAdapter(member_adapter);

        return myInflatedView;
    }

    @Override
    public void onResume() {



        super.onResume();
    }
    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
