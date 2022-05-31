import java.util.Arrays;

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
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                final_outputs[final_outputs.length-1]=string_to_2d_array_converter_double(current_2d_string);
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

    public static int[][][] string_to_3d_array_integer(String input_string)
    {
        int[][][] final_outputs={};
        String current_2d_string="";
        for (int i=0; i<input_string.length()-2; i++) //-2 so it doesn't count the last character at all
        {
            if ((input_string.charAt(i)=='}') && (input_string.charAt(i+1)=='}'))
            {
                current_2d_string+="}";
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                final_outputs[final_outputs.length-1]=string_to_2d_array_converter_integer(current_2d_string);
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

    public static boolean[][][] string_to_3d_array_boolean(String input_string)
    {
        boolean[][][] final_outputs={};
        String current_2d_string="";
        for (int i=0; i<input_string.length()-2; i++) //-2 so it doesn't count the last character at all
        {
            if ((input_string.charAt(i)=='}') && (input_string.charAt(i+1)=='}'))
            {
                current_2d_string+="}";
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                final_outputs[final_outputs.length-1]=string_to_2d_array_converter_boolean(current_2d_string);
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

    public static String[][][] string_to_3d_array_string(String input_string)
    {
        String[][][] final_outputs={};
        String current_2d_string="";
        for (int i=0; i<input_string.length()-2; i++) //-2 so it doesn't count the last character at all
        {
            if ((input_string.charAt(i)=='}') && (input_string.charAt(i+1)=='}'))
            {
                current_2d_string+="}";
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                final_outputs[final_outputs.length-1]=string_to_2d_array_converter_string(current_2d_string);
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

    public static double[][] string_to_2d_array_converter_double(String input_string)
    {
        double[][] final_outputs={};
        String current_pending_number_LIST_string="{"; //Starts it off like a normal list
        for (int i=0; i<input_string.length(); i++)
        {
            if (input_string.charAt(i)=='}')
            {
                if (!(current_pending_number_LIST_string+"}").equals("{}")) //The reason the top and bottom ifs here are seperated is that it doesn't give an error on the last character.
                {
                    current_pending_number_LIST_string+="}";
                    final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                    final_outputs[final_outputs.length-1]=string_to_array_conversion(current_pending_number_LIST_string);
                    current_pending_number_LIST_string="{"; //Starts it off like a normal list
                }
            }
            else
            {
                if (!(input_string.charAt(i)=='{')  && !(input_string.charAt(i+1)=='{') && !(input_string.charAt(i-1)=='}')) //Makes sure it only counts whatmakes it a normal list
                {
                    current_pending_number_LIST_string+=input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static int[][] string_to_2d_array_converter_integer(String input_string)
    {
        int[][] final_outputs={};
        String current_pending_number_LIST_string="{"; //Starts it off like a normal list
        for (int i=0; i<input_string.length(); i++)
        {
            if (input_string.charAt(i)=='}')
            {
                if (!(current_pending_number_LIST_string+"}").equals("{}")) //The reason the top and bottom ifs here are seperated is that it doesn't give an error on the last character.
                {
                    current_pending_number_LIST_string+="}";
                    final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                    final_outputs[final_outputs.length-1]=string_to_array_conversion_integer(current_pending_number_LIST_string);
                    current_pending_number_LIST_string="{"; //Starts it off like a normal list
                }
            }
            else
            {
                if (!(input_string.charAt(i)=='{')  && !(input_string.charAt(i+1)=='{') && !(input_string.charAt(i-1)=='}')) //Makes sure it only counts whatmakes it a normal list
                {
                    current_pending_number_LIST_string+=input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static boolean[][] string_to_2d_array_converter_boolean(String input_string)
    {
        boolean[][] final_outputs={};
        String current_pending_number_LIST_string="{"; //Starts it off like a normal list
        for (int i=0; i<input_string.length(); i++)
        {
            if (input_string.charAt(i)=='}')
            {
                if (!(current_pending_number_LIST_string+"}").equals("{}")) //The reason the top and bottom ifs here are seperated is that it doesn't give an error on the last character.
                {
                    current_pending_number_LIST_string+="}";
                    final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                    final_outputs[final_outputs.length-1]=string_to_array_conversion_boolean(current_pending_number_LIST_string);
                    current_pending_number_LIST_string="{"; //Starts it off like a normal list
                }
            }
            else
            {
                if (!(input_string.charAt(i)=='{')  && !(input_string.charAt(i+1)=='{') && !(input_string.charAt(i-1)=='}')) //Makes sure it only counts whatmakes it a normal list
                {
                    current_pending_number_LIST_string+=input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static String[][] string_to_2d_array_converter_string(String input_string)
    {
        String[][] final_outputs={};
        String current_pending_number_LIST_string="{"; //Starts it off like a normal list
        for (int i=0; i<input_string.length(); i++)
        {
            if (input_string.charAt(i)=='}')
            {
                if (!(current_pending_number_LIST_string+"}").equals("{}")) //The reason the top and bottom ifs here are seperated is that it doesn't give an error on the last character.
                {
                    current_pending_number_LIST_string+="}";
                    final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                    final_outputs[final_outputs.length-1]=string_to_array_conversion_string(current_pending_number_LIST_string);
                    current_pending_number_LIST_string="{"; //Starts it off like a normal list
                }
            }
            else
            {
                if (!(input_string.charAt(i)=='{')  && !(input_string.charAt(i+1)=='{') && !(input_string.charAt(i-1)=='}')) //Makes sure it only counts whatmakes it a normal list
                {
                    current_pending_number_LIST_string+=input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static double[] string_to_array_conversion(String input_string)
    {
        String revised_input_string=input_string.replace(" ","");
        double[] final_outputs={};
        String current_pending_number_string="";
        for (int i=0; i<revised_input_string.length(); i++) //Goes through every character
        {
            if ((revised_input_string.charAt(i)==',') || ((revised_input_string.charAt(i)=='}')))
            {
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                try
                {
                    final_outputs[final_outputs.length-1]=Double.parseDouble(current_pending_number_string);
                }
                catch (Exception ex)
                {

                }
                current_pending_number_string="";
            }
            else
            {
                if (!(revised_input_string.charAt(i)=='{'))
                {
                    current_pending_number_string+=revised_input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static int[] string_to_array_conversion_integer(String input_string)
    {
        String revised_input_string=input_string.replace(" ","");
        int[] final_outputs={};
        String current_pending_number_string="";
        for (int i=0; i<revised_input_string.length(); i++) //Goes through every character
        {
            if ((revised_input_string.charAt(i)==',') || ((revised_input_string.charAt(i)=='}')))
            {
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                try
                {
                    final_outputs[final_outputs.length-1]=(int)Double.parseDouble(current_pending_number_string);
                }
                catch (Exception ex)
                {

                }
                current_pending_number_string="";
            }
            else
            {
                if (!(revised_input_string.charAt(i)=='{'))
                {
                    current_pending_number_string+=revised_input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    
    public static boolean[] string_to_array_conversion_boolean(String input_string)
    {
        String revised_input_string=input_string.replace(" ","");
        boolean[] final_outputs={};
        String current_pending_string="";
        for (int i=0; i<revised_input_string.length(); i++) //Goes through every character
        {
            if ((revised_input_string.charAt(i)==',') || ((revised_input_string.charAt(i)=='}')))
            {
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                try
                {
                    if (current_pending_string.equals("true"))
                    {
                        final_outputs[final_outputs.length-1]=true;
                    }
                    else
                    {
                        final_outputs[final_outputs.length-1]=false;
                    }
                }
                catch (Exception ex)
                {

                }
                current_pending_string="";
            }
            else
            {
                if (!(revised_input_string.charAt(i)=='{'))
                {
                    current_pending_string+=revised_input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static String[] string_to_array_conversion_string(String input_string)
    {
        String revised_input_string=input_string.replace(" ","");
        String[] final_outputs={};
        String current_pending_string="";
        for (int i=0; i<revised_input_string.length(); i++) //Goes through every character
        {
            if ((revised_input_string.charAt(i)==',') || ((revised_input_string.charAt(i)=='}')))
            {
                final_outputs=Arrays.copyOf(final_outputs, final_outputs.length+1);
                try
                {
                    final_outputs[final_outputs.length-1]=current_pending_string;
                }
                catch (Exception ex)
                {

                }
                current_pending_string="";
            }
            else
            {
                if (!(revised_input_string.charAt(i)=='{'))
                {
                    current_pending_string+=revised_input_string.charAt(i);
                }
            }
        }
        return final_outputs;
    }

    public static void main(String[] args)
    {
        String input_string_double="{{{1.1,2.2},{3.3,4.4},{5.5,6.6}},{{7.7,8.8},{9.9,10.01},{11.11,12.12}}}";
        double[][][] double_outputs=string_to_3d_array_double(input_string_double);
        System.out.println(double_outputs[0][0][0]);
        System.out.println(double_outputs[0][0][1]);
        System.out.println(double_outputs[0][1][0]);
        System.out.println(double_outputs[0][1][1]);
        System.out.println(double_outputs[0][2][0]);
        System.out.println(double_outputs[0][2][1]);
        System.out.println(double_outputs[1][0][0]);
        System.out.println(double_outputs[1][0][1]);
        System.out.println(double_outputs[1][1][0]);
        System.out.println(double_outputs[1][1][1]);
        System.out.println(double_outputs[1][2][0]);
        System.out.println(double_outputs[1][2][1]);
        String input_string_integer="{{{1.78,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}}";
        int[][][] integer_outputs=string_to_3d_array_integer(input_string_integer);
        System.out.println(integer_outputs[0][0][0]);
        System.out.println(integer_outputs[0][0][1]);
        System.out.println(integer_outputs[0][1][0]);
        System.out.println(integer_outputs[0][1][1]);
        System.out.println(integer_outputs[0][2][0]);
        System.out.println(integer_outputs[0][2][1]);
        System.out.println(integer_outputs[1][0][0]);
        System.out.println(integer_outputs[1][0][1]);
        System.out.println(integer_outputs[1][1][0]);
        System.out.println(integer_outputs[1][1][1]);
        System.out.println(integer_outputs[1][2][0]);
        System.out.println(integer_outputs[1][2][1]);
        String input_string_boolean="{{{true,false},{false,true},{true,true}},{{false,false},{true,false},{false,false}}}";
        boolean[][][] boolean_outputs=string_to_3d_array_boolean(input_string_boolean);
        System.out.println(boolean_outputs[0][0][0]);
        System.out.println(boolean_outputs[0][0][1]);
        System.out.println(boolean_outputs[0][1][0]);
        System.out.println(boolean_outputs[0][1][1]);
        System.out.println(boolean_outputs[0][2][0]);
        System.out.println(boolean_outputs[0][2][1]);
        System.out.println(boolean_outputs[1][0][0]);
        System.out.println(boolean_outputs[1][0][1]);
        System.out.println(boolean_outputs[1][1][0]);
        System.out.println(boolean_outputs[1][1][1]);
        System.out.println(boolean_outputs[1][2][0]);
        System.out.println(boolean_outputs[1][2][1]);
        String input_string_string="{{{a,b},{C,D},{EF,Gh}},{{Ij,k_9},{12,1asdf},{hi,bye}}}";
        String[][][] string_outputs=string_to_3d_array_string(input_string_string);
        System.out.println(string_outputs[0][0][0]);
        System.out.println(string_outputs[0][0][1]);
        System.out.println(string_outputs[0][1][0]);
        System.out.println(string_outputs[0][1][1]);
        System.out.println(string_outputs[0][2][0]);
        System.out.println(string_outputs[0][2][1]);
        System.out.println(string_outputs[1][0][0]);
        System.out.println(string_outputs[1][0][1]);
        System.out.println(string_outputs[1][1][0]);
        System.out.println(string_outputs[1][1][1]);
        System.out.println(string_outputs[1][2][0]);
        System.out.println(string_outputs[1][2][1]);
    }
}


//go to https://github.com/Algorithmic-TITAN/Java_string_to_3d_array_converter to save your work!