class Java_string_to_3d_array
{

    public static double[][][] string_to_3d_array_double(String input_string)
    {
        double[][][] final_outputs={};
        String current_2d_string="";
        for (int i=0; i<input_string.length()-2; i++) //-2 so it doesn't count the last character at all
        {
            if ((input_string.charAt(i)=='}') && (input_string.charAt(i+1)=='}'))
            {
                current_2d_string+="}";
                System.out.println(current_2d_string);
                current_2d_string="";
            }
            else
            {
                if (!((input_string.charAt(i+1)==',') && (current_2d_string=="")))
                {
                    current_2d_string+=input_string.charAt(i+1);
                }
            }
        }
        return  final_outputs;
    }

    public static void main(String[] args)
    {
        String input_string_double="{{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}}";
        double[][][] double_outputs=string_to_3d_array_double(input_string_double);
        System.out.println(double_outputs);
    }
}

//go to https://github.com/Algorithmic-TITAN/Java_string_to_3d_array_converter to save your work!